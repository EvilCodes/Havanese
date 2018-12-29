package org.havanese.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/12/14 0014.
 */
@Controller
@RequestMapping("havanese/common")
public class ShareMsgController {
    @RequestMapping("sharemsg")
    private String goToCurrentPage(){
        return "jie/sharemsg";
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


}
