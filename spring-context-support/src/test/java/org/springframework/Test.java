package org.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test1(){
        new ClassPathXmlApplicationContext("aaa.xml");
    }
}
