package com.house.house.contorller;

import com.house.house.entity.User;
import com.house.house.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @ResponseBody
    public String getHome() {

        return "Test Version v0.0.1";
    }

    @GetMapping("/room")
    @ResponseBody
    public String getRoom(){
        return "Continuous Room";
    }

    @Operation(summary = "사용자 저장", description = "사용자 정보를 저장합니다.", responses = {
            @ApiResponse(responseCode = "200", description = "사용자 저장 성공"),
            @ApiResponse(responseCode = "400", description = "잘못된 요청")
    })
    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }


}
