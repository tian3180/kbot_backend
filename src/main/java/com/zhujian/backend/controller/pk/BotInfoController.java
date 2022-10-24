package com.zhujian.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author jobszhu
 * @date 2022/10/24 19:44
 * @project backend
 * @Description
 */
@RestController
@RequestMapping("/pk")
public class BotInfoController {
    @RequestMapping("/getBotInfo")
    public Map<String,String> getbotInfo(){

        HashMap<String, String> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("name","tiger");
        objectObjectHashMap.put("name","apple");
        return objectObjectHashMap;

    }
}
