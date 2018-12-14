package org.havanese.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/12/14 0014.
 */
@Controller
@RequestMapping("havanese/user")
public class UserCenterController {
    @RequestMapping("/tabpublished")
    private String selectPubPage(){
       return "user/mypublished";
    }

    @RequestMapping("/tabcollected")
    private String selectColPage(){
        return "user/mycollected";
    }
}


