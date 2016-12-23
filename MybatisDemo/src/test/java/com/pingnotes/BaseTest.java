package com.pingnotes;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by shaobo on 12/23/16.
 */
public class BaseTest {
    protected ApplicationContext ctx;

    @Before
    public void before(){
        ctx = new AnnotationConfigApplicationContext("com.pingnotes");
    }
}
