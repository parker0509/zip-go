package com.house.house.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {

    @GetMapping("/")
    @ResponseBody
    public String getHome() {

        return "TEST API 실행중...";
    }


}
