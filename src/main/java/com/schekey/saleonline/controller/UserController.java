package com.schekey.saleonline.controller;

import com.schekey.saleonline.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource(name = "userService")
    private UserService userService;
    @RequestMapping("/")
    public ModelAndView getUser(ModelMap map){
        map.addAttribute("users",userService.getUser());
        return new ModelAndView("index");
    }
}
