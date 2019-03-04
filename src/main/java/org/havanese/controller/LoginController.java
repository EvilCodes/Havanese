package org.havanese.controller;

import org.havanese.dto.LoginEntity;
import org.havanese.service.ILoginAndRegister;
import org.havanese.util.EstimateObjectUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/12/14 0014.
 */
@Controller
@RequestMapping("havanese/user")
public class LoginController {
    @Autowired
    private ILoginAndRegister loginAndRegister;


    @RequestMapping("login")
    private String goToCurrentPage(){
        return "user/login";
    }
    @RequestMapping("executeLogin")
    private String executeLogin(LoginEntity loginEntity, HttpServletRequest request){
        String jumpPath=null;
        boolean isSuccessed=loginAndRegister.login(loginEntity,request);
        if (isSuccessed) {
            jumpPath="redirect:../loginedhome";
        }
        System.out.print("jumpPath="+jumpPath);
        return jumpPath;
    }
}
