package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.User;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

public interface UserMapper extends Mapper<User> {
    void saveNow(User user);

    List<User> selectByNameAndSex(String name, Integer sex);

    int count();

    String findNameById(int id);

    List<User> queryUserClassroom();

    List<Map<String, Object>> queryOrder();

    @MapKey("id")
    Map<Integer, User> getUser2();

    List<User> getUser3();

    User queryUserByName(String username);


}