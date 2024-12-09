package com.house.house.contorller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Tag(name = "Home", description = "연방 홈 페이지 관련 API")
public class homeController {

    @Operation(summary = "Server LIVE CHECK ", description = "서버 체크 용", responses = {
            @ApiResponse(responseCode = "200",description = "Server ON")})

    @GetMapping("/")
    @ResponseBody
    public String getHome() {

        return "TEST API 실행중...";
    }


}
