package com.schekey.saleonline.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class F {

    @RequestMapping("/")
    public String index(ModelMap map){
        map.addAttribute("hello","Hello world");
        return "index.html";
    }
}
