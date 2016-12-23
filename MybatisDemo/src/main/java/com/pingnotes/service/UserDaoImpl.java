package com.pingnotes.service;

import com.pingnotes.pojo.Users;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by shaobo on 12/23/16.
 */
@Repository("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport {

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sessionFactory){
        super.setSqlSessionFactory(sessionFactory);
    }

    public Users foo(Long id){
        return getSqlSession().selectOne("com.pingnotes.mapper.UsersMapper.selectByPrimaryKey", id);
    }
}
