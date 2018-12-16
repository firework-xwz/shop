package com.yunjisuan.sale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MoviesController {

    @RequestMapping("/list")
    public String list(){
        return "list";
    }
}
