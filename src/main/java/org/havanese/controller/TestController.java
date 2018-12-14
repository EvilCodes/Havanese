package org.havanese.controller;

import org.havanese.pojo.User;
import org.havanese.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/12/8 0008.
 */
@Controller
public class TestController {

    @Autowired
    private ITestService testService;


    @RequestMapping("/hello")
    public String getMsg(){
        return "index";
    }
}
