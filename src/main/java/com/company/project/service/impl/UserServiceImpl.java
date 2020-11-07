package com.company.project.service.impl;

import com.company.project.dao.UserMapper;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.company.project.core.AbstractService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2020/04/15.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public void saveNow(User user) {
        userMapper.saveNow(user);
    }

    @Override
    public List<User> selectByNameAndSex(String name, Integer sex) {
        return userMapper.selectByNameAndSex(name, sex);
    }

    @Override
    public int count() {
        return userMapper.count();
    }

    @Override
    public String findNameById(int id) {
        return userMapper.findNameById(id);
    }

    @Override
    public List<User> queryUserClassroom() {
        return userMapper.queryUserClassroom();
    }

    @Override
    public List<Map<String, Object>> queryOrder() {
        return userMapper.queryOrder();
    }

    @Override
    public Map<Integer, User> getUser2() {
        return userMapper.getUser2();
    }

    @Override
    public List<User> getUser3() {
        return userMapper.getUser3();
    }

    @Override
    public User queryUserByName(String username) {
        return userMapper.queryUserByName(username);
    }


}
