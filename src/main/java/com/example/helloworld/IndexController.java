package com.example.helloworld;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController {
    @RequestMapping("/")
    public String indexPage(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
        return "index";
    }
}