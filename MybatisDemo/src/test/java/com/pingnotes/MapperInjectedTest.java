package com.pingnotes;

import com.pingnotes.mapper.MailAccountsMapper;
import com.pingnotes.pojo.MailAccounts;
import com.pingnotes.util.ClsPathResourceUtils;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by shaobo on 12/23/16.
 */
public class MapperInjectedTest extends BaseTest{
    @Test
    public void t(){
        MailAccountsMapper mapper = ctx.getBean("mailAccountsMapper", MailAccountsMapper.class);
        MailAccounts mail = mapper.selectByPrimaryKey(23l);
        System.out.println(mail.getEmail());
    }

    @Test
    public void t2(){
        try {
            String [] xmls = ClsPathResourceUtils.populate("mapper");
            for (String x :xmls){
                System.out.println(x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
