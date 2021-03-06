//package com.example.springboot.controller.login;
//
//import com.example.springboot.constant.SecurityConstants;
//import com.example.springboot.entity.User;
//import com.example.springboot.request.LoginRequest;
//import com.example.springboot.service.LoginService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.support.SessionStatus;
//
//import javax.servlet.http.HttpSession;
//
//@RestController
//@RequestMapping("/api/auth")
//@Api(tags = "Auth")
//public class LoginController {
//    @Autowired
//    private LoginService authService;
//
//
//
//    @PostMapping("/login")
//    @ApiOperation(value = "登入")
//    public ResponseEntity<User> login(@RequestBody LoginRequest userLogin) {
//        // 用户登录认证
//        User jwtUser = authService.authLogin(userLogin);
//        // 认证成功后，将 token 存入响应头中返回
//        HttpHeaders httpHeaders = new HttpHeaders();
//        // 添加 token 前缀 "Bearer ",驗證辨識用
//        httpHeaders.set(SecurityConstants.TOKEN_HEADER, SecurityConstants.TOKEN_PREFIX + jwtUser.getToken());
//
//        return new ResponseEntity<>(jwtUser, httpHeaders, HttpStatus.OK);
////        return new MyResponse("success","token:"+jwtUser.getToken());
//
//    }
//
//    @PostMapping("/logout")
//    @ApiOperation(value = "用户退出登录")
//    public ResponseEntity<Void> logout(HttpSession session, SessionStatus sessionStatus) {
//        //讓token過期就好
//        session.invalidate();
//        sessionStatus.setComplete();
//        authService.logout();
//
//        return ResponseEntity.ok().build();
//    }
//}
