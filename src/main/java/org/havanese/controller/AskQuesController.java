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
    private boolean loginStatus;

    @RequestMapping("askques")
    private String goToCurrentPage(){
        return "jie/askques";
    }

    @RequestMapping("loginedAskques")
    private String goToLoginedCurrentPage(){
        return "jie/logined/askques";
    }

    @RequestMapping("loginedAskques/essence")
    private String goToLoginedEssencePage(){
        pathDesc = SubPageJumping.essencePageDesc(BASE_DESC,true);
        return pathDesc;
    }

    @RequestMapping("loginedAskques/payamount")
    private String goToLoginedPayamountPage(){
        pathDesc = SubPageJumping.payamountPageDesc(BASE_DESC,true);
        return pathDesc;
    }
    @RequestMapping("loginedAskques/synthesis")
    private String goToLoginedSynthesisPage(){
        pathDesc = SubPageJumping.synthesisPageDesc(BASE_DESC,true);
        return pathDesc;
    }
    @RequestMapping("loginedAskques/unliquidated")
    private String goToLoginedUnliquidatedPage(){
        pathDesc = SubPageJumping.unliquidatedPageDesc(BASE_DESC,true);
        return pathDesc;
    }

    @RequestMapping("askques/essence")
    private String goToEssencePage(){
        pathDesc = SubPageJumping.essencePageDesc(BASE_DESC,false);
        return pathDesc;
    }

    @RequestMapping("askques/payamount")
    private String goToPayamountPage(){
        pathDesc = SubPageJumping.payamountPageDesc(BASE_DESC,false);
        return pathDesc;
    }
    @RequestMapping("askques/synthesis")
    private String goToSynthesisPage(){
        pathDesc = SubPageJumping.synthesisPageDesc(BASE_DESC,false);
        return pathDesc;
    }
    @RequestMapping("askques/unliquidated")
    private String goToUnliquidatedPage(){
        pathDesc = SubPageJumping.unliquidatedPageDesc(BASE_DESC,false);
        return pathDesc;
    }







}
