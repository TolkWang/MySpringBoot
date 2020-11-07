package com.company.project.service;

import com.company.project.dao.UserMapper;
import com.company.project.model.User;
import com.company.project.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2020/04/15.
 */
public interface UserService extends Service<User> {
    void saveNow(User user);

    List<User> selectByNameAndSex(String name, Integer sex);

    int count();

    String findNameById(int id);

    List<User> queryUserClassroom();

    List<Map<String, Object>> queryOrder();

    Map<Integer, User> getUser2();

    List<User> getUser3();

    User queryUserByName(String username);
}
