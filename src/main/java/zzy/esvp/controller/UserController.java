package zzy.esvp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import zzy.esvp.eneity.User;
import zzy.esvp.service.UserService;

import java.util.List;

//@Controller
//@RequestBody
@RequestMapping("/users")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //    注册
    @GetMapping
    public String register(User user) {
        System.out.println("User" + user.getEmail() + ", password: " + user.getPassword());
        return "register success";
    }

    //    登录
    @PostMapping
    public String login(@RequestBody User user) {
        System.out.println("email: " + user.getEmail() + ", password: " + user.getPassword());
        List<User> users = userService.findAll();
        System.out.println(users);
        return "login success";
    }
}
