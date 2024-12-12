package com.house.house.contorller;

import com.house.house.entity.User;
import com.house.house.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {


    private UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public String joinForm(Model model){

        model.addAttribute("user",new User());

        return "join-form";
    }


    @Operation(summary = "사용자 저장", description = "사용자 정보를 저장합니다.", responses = {
            @ApiResponse(responseCode = "200", description = "사용자 저장 성공"),
            @ApiResponse(responseCode = "400", description = "잘못된 요청")
    })

    @PostMapping("/join")
    public String saveUser(@ModelAttribute User user) {

        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/deleteAll")
    @ResponseBody
    public String deleteAllUsers() {
        userService.deleteUserAll();
        return "전부 삭제 되었습니다.";
    }


}


