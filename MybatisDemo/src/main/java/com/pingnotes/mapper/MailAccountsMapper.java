package com.pingnotes.mapper;

import com.pingnotes.pojo.MailAccounts;
import com.pingnotes.pojo.MailAccountsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MailAccountsMapper {
    long countByExample(MailAccountsExample example);

    int deleteByExample(MailAccountsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MailAccounts record);

    int insertSelective(MailAccounts record);

    List<MailAccounts> selectByExample(MailAccountsExample example);

    MailAccounts selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MailAccounts record, @Param("example") MailAccountsExample example);

    int updateByExample(@Param("record") MailAccounts record, @Param("example") MailAccountsExample example);

    int updateByPrimaryKeySelective(MailAccounts record);

    int updateByPrimaryKey(MailAccounts record);
}