package com.yunjisuan.sale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SingleController {

    @RequestMapping("/single")
    public String single(){
        return "single";
    }
}
