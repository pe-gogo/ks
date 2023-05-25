package com.seig.consumer1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Consumer1Controller {
    @Autowired
    private Consumer1Feign consumer1Feign;

    @RequestMapping(value = "/save")
    public ActionResult save(User user){
        User user1 = consumer1Feign.save(user);
        ActionResult actionResult = new ActionResult(2040,"郑宏森",user1);
        return actionResult;
    }

    @RequestMapping(value = "/stuInfo/{uid}")
    public ActionResult findById(@PathVariable String uid){
        User user1 = consumer1Feign.findById(uid);
        ActionResult actionResult = new ActionResult(2040,"查询",user1);
        return actionResult;
    }
}
