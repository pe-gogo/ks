package com.seig.consumer1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("dbService")
public interface Consumer1Feign {
    @RequestMapping(value = "/stuInfo",method = RequestMethod.POST )
    public User save(@RequestBody User user);
    @RequestMapping(value = "/stuInfo/{uid}",method = RequestMethod.GET)
    public User findById(@PathVariable(value = "uid") String uid);
}
