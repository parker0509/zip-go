package com.house.house.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {

    @GetMapping("/")
    @ResponseBody
    public String getHome() {

        return "안녕하세요 민경씨 ^^";
    }


}
