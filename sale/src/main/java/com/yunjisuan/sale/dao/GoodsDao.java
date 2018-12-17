package com.yunjisuan.sale.dao;

import com.yunjisuan.sale.entity.Goods;

import java.util.ArrayList;
import java.util.List;

public class GoodsDao {

    public List search(){
        List goodsList=new ArrayList<>();
        for(int i=0;i<100;i++)
        {
            Goods goods=new Goods("151515","Tom and Jerry","T","action movie","猫和老鼠",59,18,29,"王陆洋","徐伟喆",15515155,"ewfwefwefwefw");
            goodsList.add(goods);
        }
        return goodsList;
    }
}
