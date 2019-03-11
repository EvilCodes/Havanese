package org.havanese.controller;

import org.havanese.util.SubPageJumping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by blackfox on 2018/12/14 0014.
 */
@Controller
@RequestMapping("havanese/common")
public class AskQuesController {
    private static final String BASE_DESC = "askques";
    private String pathDesc;

    @RequestMapping("askques")
    private String goToCurrentPage(){
        return "jie/askques";
    }

    @RequestMapping("loginedAskques")
    private String goToLoginedCurrentPage(){
        return "jie/logined/askques";
    }

    @RequestMapping("askques/essence")
    private String goToEssencePage(){
        pathDesc = SubPageJumping.essencePageDesc(BASE_DESC);
        return pathDesc;
    }

    @RequestMapping("askques/payamount")
    private String goToPayamountPage(){
        pathDesc = SubPageJumping.payamountPageDesc(BASE_DESC);
        return pathDesc;
    }
    @RequestMapping("askques/synthesis")
    private String goToSynthesisPage(){
        pathDesc = SubPageJumping.synthesisPageDesc(BASE_DESC);
        return pathDesc;
    }
    @RequestMapping("askques/unliquidated")
    private String goToUnliquidatedPage(){
        pathDesc = SubPageJumping.unliquidatedPageDesc(BASE_DESC);
        return pathDesc;
    }







}
