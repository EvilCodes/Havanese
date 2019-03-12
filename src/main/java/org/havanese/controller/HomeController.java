package org.havanese.controller;

import org.havanese.util.SubPageJumping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/12/14 0014.
 */
@Controller
@RequestMapping("havanese")
public class HomeController {
    private static final String BASE_DESC = "home";
    private String pathDesc;
    @RequestMapping("home")
    private String goToCurrentPage(){
        return "index";
    }

    @RequestMapping("loginedhome")
    private String goToLoginedHomePage(){
        return "user/loginedhome";
    }

    @RequestMapping("loginedhome/essence")
    private String goToLoginedEssencePage(){
        pathDesc = SubPageJumping.essencePageDesc(BASE_DESC,true);
        return pathDesc;
    }

    @RequestMapping("loginedhome/payamount")
    private String goToLoginedPayamountPage(){
        pathDesc = SubPageJumping.payamountPageDesc(BASE_DESC,true);
        return pathDesc;
    }
    @RequestMapping("loginedhome/synthesis")
    private String goToLoginedSynthesisPage(){
        pathDesc = SubPageJumping.synthesisPageDesc(BASE_DESC,true);
        return pathDesc;
    }
    @RequestMapping("loginedhome/unliquidated")
    private String goToLoginedUnliquidatedPage(){
        pathDesc = SubPageJumping.unliquidatedPageDesc(BASE_DESC,true);
        return pathDesc;
    }

    @RequestMapping("home/essence")
    private String goToEssencePage(){
        pathDesc = SubPageJumping.essencePageDesc(BASE_DESC,false);
        return pathDesc;
    }

    @RequestMapping("home/payamount")
    private String goToPayamountPage(){
        pathDesc = SubPageJumping.payamountPageDesc(BASE_DESC,false);
        return pathDesc;
    }
    @RequestMapping("home/synthesis")
    private String goToSynthesisPage(){
        pathDesc = SubPageJumping.synthesisPageDesc(BASE_DESC,false);
        return pathDesc;
    }
    @RequestMapping("home/unliquidated")
    private String goToUnliquidatedPage(){
        pathDesc = SubPageJumping.unliquidatedPageDesc(BASE_DESC,false);
        return pathDesc;
    }

}
