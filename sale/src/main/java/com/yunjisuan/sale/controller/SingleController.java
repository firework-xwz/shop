package com.yunjisuan.sale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class SingleController {

    @GetMapping("/single1")
    @ResponseBody
    public int single(@RequestParam(value = "id")String id, HttpSession httpSession){
        httpSession.setAttribute("goods_id",id);
        httpSession.setMaxInactiveInterval(3600);
        System.out.println(id);
        return 1;
    }

    @RequestMapping("/single")
    public String single(Model model, HttpSession httpSession){
        model.addAttribute("goods_id",httpSession.getAttribute("goods_id"));
        return "single";
    }
}
