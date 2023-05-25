package com.seig.dbservice.service.impl;

import com.seig.dbservice.bean.User;
import com.seig.dbservice.repository.UserRepository;
import com.seig.dbservice.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public User findById(String uid) {
        Optional<User> byId = userRepository.findById(uid);
        return byId.get();
    }

    @Override
    public User save(User user) {
        User add = userRepository.save(user);
        return add;
    }
}
