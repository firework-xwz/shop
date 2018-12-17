package com.yunjisuan.sale.controller;

import com.yunjisuan.sale.dao.GoodsDao;
import com.yunjisuan.sale.entity.Goods;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GoodsController {



    @RequestMapping("/list")
    public String list(Model model){
        System.out.println("---list---");
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
