package zzy.esvp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import zzy.esvp.eneity.User;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

//    传递json 数组的方式demo
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody List<String> list) {
        System.out.println(list);
        return "{'info':'springmvc'}";
    }

    @RequestMapping("/register")
    @ResponseBody
    public String register(User user){

        System.out.println("User" + user.getEmail() + ", password: " + user.getPassword());
        return "{'info':'springmvc'}";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam("email") String email,@RequestParam("password") String password){
        System.out.println("email: " + email + ", password: " + password);
        return "{'info':'springmvc'}";
    }
}
