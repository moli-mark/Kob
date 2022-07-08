package com.zzy.backend.controller.pk;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class BotinfoController {

    @GetMapping("getbotinfo/")
    public Map<String,String> getBotInfo(){
        Map<String,String> mp=new HashMap<>();
        mp.put("name","tiger");
        mp.put("score","1600");
        return mp;
    }
}
