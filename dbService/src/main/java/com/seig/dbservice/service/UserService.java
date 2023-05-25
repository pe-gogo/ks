package com.seig.dbservice.service;

import com.seig.dbservice.bean.User;
import com.seig.dbservice.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


public interface UserService {

    public User findById(String uid);

    public User save(User user);

}
