package com.team.gameblog.controller;

import com.team.gameblog.dto.user.ProfileResponseDto;
import com.team.gameblog.dto.user.SignupRequestDto;
import com.team.gameblog.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    //회원가입
    @PostMapping("/user/signup")
    public void signup(){

        userService.signup();

    }

    //회원가입 페이지
    @GetMapping("/user/signup")
    public String signupPage() {

        return "";
    }

    // 로그인 페이지
    @GetMapping("/user/login-page")
    public String loginPage() {
        return "";
    }

    // 로그아웃후 전체 게시글 페이지
    @GetMapping("/logout")
    public String logout(){

        return "";
    }

    //프로필 생성
    @PostMapping("/profile")
    public ProfileResponseDto createProfile(){
        return userService.createProfile();
    }

    //프로필 수정
    @PutMapping("/profile")
    public ProfileResponseDto updateProfile(){
        return userService.updateProfile();
    }


}