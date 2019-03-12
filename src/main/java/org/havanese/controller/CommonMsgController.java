package org.havanese.controller;

import org.havanese.util.SubPageJumping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/12/14 0014.
 */
@Controller
@RequestMapping("havanese/common")
public class CommonMsgController {
    private static final String BASE_DESC="announcement";
    private String pathDesc;
    @RequestMapping("announcement")
    private String goToCurrentPage(){
        return "jie/announcement";
    }

    @RequestMapping("loginedAnnouncement")
    private String goToLoginedCurrentPage(){
        return "jie/logined/announcement";
    }

    @RequestMapping("loginedAnnouncement/essence")
    private String goToLoginedEssencePage(){
        pathDesc = SubPageJumping.essencePageDesc(BASE_DESC,true);
        return pathDesc;
    }

    @RequestMapping("loginedAnnouncement/payamount")
    private String goToLoginedPayamountPage(){
        pathDesc = SubPageJumping.payamountPageDesc(BASE_DESC,true);
        return pathDesc;
    }
    @RequestMapping("loginedAnnouncement/synthesis")
    private String goToLoginedSynthesisPage(){
        pathDesc = SubPageJumping.synthesisPageDesc(BASE_DESC,true);
        return pathDesc;
    }
    @RequestMapping("loginedAnnouncement/unliquidated")
    private String goToLoginedUnliquidatedPage(){
        pathDesc = SubPageJumping.unliquidatedPageDesc(BASE_DESC,true);
        return pathDesc;
    }

    @RequestMapping("announcement/essence")
    private String goToEssencePage(){
        pathDesc = SubPageJumping.essencePageDesc(BASE_DESC,false);
        return pathDesc;
    }

    @RequestMapping("announcement/payamount")
    private String goToPayamountPage(){
        pathDesc = SubPageJumping.payamountPageDesc(BASE_DESC,false);
        return pathDesc;
    }
    @RequestMapping("announcement/synthesis")
    private String goToSynthesisPage(){
        pathDesc = SubPageJumping.synthesisPageDesc(BASE_DESC,false);
        return pathDesc;
    }
    @RequestMapping("announcement/unliquidated")
    private String goToUnliquidatedPage(){
        pathDesc = SubPageJumping.unliquidatedPageDesc(BASE_DESC,false);
        return pathDesc;
    }
}
