package com.pingnotes;

import com.pingnotes.pojo.Users;
import com.pingnotes.service.UserDaoImpl;
import org.junit.Test;

/**
 * Created by shaobo on 12/23/16.
 */
public class SqlSessionDaoSupportTest extends BaseTest {

    @Test
    public void t() {
        UserDaoImpl userDao = ctx.getBean("userDao", UserDaoImpl.class);
        Users u = userDao.foo(23l);
        System.out.println(u.getEmail());
    }
}
