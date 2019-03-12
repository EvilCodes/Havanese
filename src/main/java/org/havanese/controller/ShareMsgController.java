package org.havanese.controller;

import org.havanese.util.SubPageJumping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/12/14 0014.
 */
@Controller
@RequestMapping("havanese/common")
public class ShareMsgController {
    private static final String BASE_DESC = "sharemsg";
    private String pathDesc = null;
    @RequestMapping("sharemsg")
    private String goToCurrentPage(){
        return "jie/sharemsg";
    }

    @RequestMapping("loginedSharemsg")
    private String goToLoginedCurrentPage(){

        return "jie/logined/sharemsg";

    }


    @RequestMapping("sharemsg/unliquidated")
    private  String  goToUnliquidated(){
        return "subtabpage/sharemsg/unliquidated";

    }

    @RequestMapping("sharemsg/synthesis")
    private String goToSynthesis(){
        return "subtabpage/sharemsg/synthesis";
    }

    @RequestMapping("sharemsg/payamount")
    private String goToPayamount(){
        return "subtabpage/sharemsg/payamount";
    }

    @RequestMapping("sharemsg/essence")
    private String goToEssence(){
        return "subtabpage/sharemsg/essence";
    }


    @RequestMapping("loginedSharemsg/essence")
    private String goToLoginedEssencePage(){
        pathDesc = SubPageJumping.essencePageDesc(BASE_DESC,true);
        return pathDesc;
    }

    @RequestMapping("loginedSharemsg/payamount")
    private String goToLoginedPayamountPage(){
        pathDesc = SubPageJumping.payamountPageDesc(BASE_DESC,true);
        return pathDesc;
    }
    @RequestMapping("loginedSharemsg/synthesis")
    private String goToLoginedSynthesisPage(){
        pathDesc = SubPageJumping.synthesisPageDesc(BASE_DESC,true);
        return pathDesc;
    }
    @RequestMapping("loginedSharemsg/unliquidated")
    private String goToLoginedUnliquidatedPage(){
        pathDesc = SubPageJumping.unliquidatedPageDesc(BASE_DESC,true);
        return pathDesc;
    }



}
