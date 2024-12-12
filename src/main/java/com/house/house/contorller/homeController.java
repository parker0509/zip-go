package com.house.house.contorller;

import com.house.house.entity.User;
import com.house.house.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

@Tag(name = "Home", description = "연방 홈 페이지 관련 API")
public class homeController {

    private UserService userService;

    @Autowired
    public homeController(UserService userService) {
        this.userService = userService;
    }

    @Operation(summary = "Server LIVE CHECK ", description = "서버 체크 용", responses = {
            @ApiResponse(responseCode = "200",description = "Server ON")})

    @GetMapping("/")
    public String getHome() {
        return "/home";
    }

    @GetMapping("/room")
    public String getRoom(){
        return "Continuous Room";
    }




}
