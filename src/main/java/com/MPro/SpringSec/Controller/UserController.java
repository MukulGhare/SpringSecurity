package com.MPro.SpringSec.Controller;

import com.MPro.SpringSec.Model.Users;
import java.util.List;
import com.MPro.SpringSec.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        //return "SUCCESS";
        return service.verify(user);
    }

    @GetMapping("/users")
    public List<Users> getUsers(){
        return service.getUsers();
    }
}
