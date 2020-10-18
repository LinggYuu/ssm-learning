package com.ly.dao;
//这个类用于操作数据库的对象的实体

import com.ly.pojo.User;

import java.util.List;

//专业点的叫mapper dao就是mapper
public interface UserDao {
    List<User> getUserList();

}
