package org.havanese.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/12/14 0014.
 */
@Controller
@RequestMapping("havanese")
public class GetDetailMsgController {
    @RequestMapping("getdetail")
    private String goToCurrentPage(){
        return "jie/detail";
    }
}
