package com.ly.dao;

import com.ly.pojo.User;
import com.ly.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //获取sqlsession
        //第一步获得sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //第二步执行sql
//        方式1
//        执行sql首先得拿到sql，要么从dao拿，要么从对应的mapper拿，我们只需从dao拿
//        获取对象
//        userdao 对应的usermapper.xml
//        为了拿到userdao
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();


        //遍历 ，输入userlist.for自动跳进
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
