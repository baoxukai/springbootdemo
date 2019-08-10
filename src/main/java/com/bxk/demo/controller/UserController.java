package com.bxk.demo.controller;

import com.bxk.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bao
 * @description conroller测试<br>
 * @create 2019/4/13 16:17
 * @since 1.0.0
 */
@Controller
@ResponseBody
@RequestMapping("/api")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getUser")
    public String getUser() {
        return userService.getUser();
    }

}
