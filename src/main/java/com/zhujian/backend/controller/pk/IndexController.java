package com.zhujian.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jobszhu
 * @date 2022/10/24 19:38
 * @project backend
 * @Description
 */
@RestController
@RequestMapping("/pk")
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "pk/index.html";
    }


}
