package com.seig.dbservice.controller;

import com.seig.dbservice.service.UserService;
import com.seig.dbservice.bean.User;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/save")
    public User save(@RequestBody User user){
        User user1 = userService.save(user);
        return user1 ;
    }

    @RequestMapping(value = "/stuInfo/{uid}",method = RequestMethod.GET)
    @ResponseBody
    public User selectUser(@PathVariable(value="uid") String uid){
        User user1 = userService.findById(uid);
        return user1;
    }
}


