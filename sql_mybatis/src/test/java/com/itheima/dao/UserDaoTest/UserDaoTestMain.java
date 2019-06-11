package com.itheima.dao.UserDaoTest;


import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class UserDaoTestMain {
    /**
     * 测试mybatis框架
     * @param args
     */
    public static void main(String[] args) throws Exception {
        //1.读取主配置文件
        InputStream is = org.apache.ibatis.io.Resources.getResourceAsStream("SqlMybatis.xml");
        //
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //
        SqlSessionFactory sessionFactory = builder.build(is);
        //
        SqlSession sqlSession = sessionFactory.openSession();
        //
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        //
        List<User> users = userDao.findAll();
        //
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
        is.close();


    }
}
