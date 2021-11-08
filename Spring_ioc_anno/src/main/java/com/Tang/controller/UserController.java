package com.Tang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Tang
 * @date 2021/11/7 - 21:58
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/quick",method = RequestMethod.GET,params = {"username"})
    public String save(){
        System.out.println("Controller save running...");
        return "success";
    }

}
