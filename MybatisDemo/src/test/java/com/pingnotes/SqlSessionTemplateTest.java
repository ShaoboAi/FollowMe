package com.pingnotes;

import com.pingnotes.pojo.Users;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;

/**
 * Created by shaobo on 12/23/16.
 */
public class SqlSessionTemplateTest extends BaseTest {

    @Test
    public void t(){

        SqlSessionTemplate sqlSession = ctx.getBean("sqlSessionTemplate", SqlSessionTemplate.class);
        Users u = sqlSession.selectOne("com.pingnotes.mapper.UsersMapper.selectByPrimaryKey", 23l);
        System.out.println(u.getEmail());
    }

}
