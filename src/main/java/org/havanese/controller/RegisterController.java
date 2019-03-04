package org.havanese.controller;

import org.havanese.dto.RegisterEntity;
import org.havanese.service.ILoginAndRegister;
import org.havanese.service.impl.LoginAndRegisterImpl;
import org.havanese.util.EstimateObjectUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/12/14 0014.
 *
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
    private String register(RegisterEntity registerEntity, HttpServletRequest request){
        System.out.print(registerEntity.toString());
        boolean isSuccessed=false;
        String jumpPath=null;
        if (EstimateObjectUtil.estimateObject(registerEntity)&&EstimateObjectUtil.verifyRegisterEntity(registerEntity,request)) {
           isSuccessed= loginAndRegister.register(registerEntity);
            if (isSuccessed) {
                    jumpPath = "redirect:/";
            }
        }
        return jumpPath;
    }

}
