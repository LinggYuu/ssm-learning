package com.ly.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;

//SqlSessionFactory工厂 生产产品 ---》sqlsession
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            //使用mybatis第一步  获取sqlsessionfactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //那个帮助文档有错
            sqlSessionFactory  = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //既然有了SqlsessionFatory 就可从 SqlSession的实例了
    //SqlSession完全包含了面向数据库执行sql命令所需的所有方法
    //static方便直接调用
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
        //操作数据库的方法

    }

    //con:定义了一个工具类把资源加载进来并创建能执行sql的对象

}
