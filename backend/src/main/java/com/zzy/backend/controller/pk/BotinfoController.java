package com.zzy.backend.controller.pk;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pk/")
public class BotinfoController {

    @GetMapping("getbotinfo/")
    public String getBotInfo(){
        return "hhh";
    }
}
