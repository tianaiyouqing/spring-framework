package test.test;

import java.io.Serializable;

public class BeanTest implements Serializable,IBeanTest {

    private String str = "hello sprinasdg";

//    @Override
    public String getStr() {
        System.out.println("str");
        return str;
    }

//    @Override
    public void setStr(String str) {
        this.str = str;
    }
}
