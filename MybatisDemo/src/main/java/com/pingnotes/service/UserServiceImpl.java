package com.pingnotes.service;

import com.pingnotes.mapper.UsersMapper;
import com.pingnotes.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by shaobo on 12/23/16.
 */
@Repository("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UsersMapper usersMapper;

    @Transactional(propagation = Propagation.REQUIRED, timeout = 10, rollbackFor = Exception.class)
    public void doSth(Long id, Users users) {
        Users u = usersMapper.selectByPrimaryKey(id);
        usersMapper.updateByPrimaryKey(users);
        throw new IllegalArgumentException("this is not right, need rollback");
    }
}
