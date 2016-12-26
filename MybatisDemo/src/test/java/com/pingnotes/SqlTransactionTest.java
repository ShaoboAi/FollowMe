package com.pingnotes;

import com.pingnotes.mapper.UsersMapper;
import com.pingnotes.pojo.Users;
import com.pingnotes.service.UserService;
import org.junit.Test;

/**
 * Created by shaobo on 12/26/16.
 */
public class SqlTransactionTest extends BaseTest {

    @Test
    public void t1(){
        UserService userService = (UserService) ctx.getBean("userService");
        UsersMapper usersMapper = ctx.getBean("usersMapper", UsersMapper.class);
        Users u= usersMapper.selectByPrimaryKey(6l);
        u.setAvatarUrl("url4");
        System.out.println(usersMapper.selectByPrimaryKey(6l).getAvatarUrl());
        try {
           userService.doSth(6l, u);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(usersMapper.selectByPrimaryKey(6l).getAvatarUrl());
    }

}
