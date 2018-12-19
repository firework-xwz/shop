package com.yunjisuan.sale.controller;

import com.yunjisuan.sale.dao.GoodsDao;
import com.yunjisuan.sale.entity.Goods;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Controller
public class GoodsController {



    @RequestMapping("/list")
    public String list(Model model){
        System.out.println("---list---");
        try{
            Class.forName("org.apache.hive.jdbc.HiveDriver");

            Connection con = DriverManager.getConnection("jdbc:hive2://192.168.233.13:10000/test");
            Statement statement = con.createStatement();

//        statement.executeUpdate("create table hello (id int, name string)");
//        statement.executeUpdate("insert into hello values (1, \"Leon\")");

            ResultSet res = statement.executeQuery("select * from Goods where goods_id = \"0001516035\"");

            res.next();

            System.out.println(res.getString("name"));
            res.close();
            statement.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }


        List goodsList=new ArrayList<>();
        for(int i=0;i<100;i++)
        {
            Goods goods=new Goods("455","Tom and Jerry","T","action movie","猫和老鼠",59,18,29,"王陆洋","徐伟喆",15515155,"ewfwefwefwefw");
            goodsList.add(goods);
        }
        model.addAttribute("goodsList",goodsList);
        return "list";
    }
}
