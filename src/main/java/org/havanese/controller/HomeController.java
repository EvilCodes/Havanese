package org.havanese.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/12/14 0014.
 */
@Controller
@RequestMapping("havanese")
public class HomeController {
    @RequestMapping("home")
    private String goToCurrentPage(){
        return "index";
    }

    @RequestMapping("loginedhome")
    private String goToLoginedHomePage(){
        return "user/loginedhome";
    }
}
