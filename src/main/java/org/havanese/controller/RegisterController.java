package org.havanese.controller;

import org.havanese.service.ILoginAndRegister;
import org.havanese.service.impl.LoginAndRegisterImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/12/14 0014.
 */
@Controller
@RequestMapping("havanese/user")
public class RegisterController {

    @Autowired
    ILoginAndRegister loginAndRegister;

    @RequestMapping("register")
    private String goToCurrentPage(){
        return "user/reg";
    }

    @RequestMapping("quickRegister")
    private String register(){
        System.out.print("进入quickRegister方法");
        return "hello";
    }

}
