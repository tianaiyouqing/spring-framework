package test.tianai.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestComponent1 {

//    @Autowired

    public TestComponent1() {
        System.out.println("xxx");
    }

    public void test1() {
        System.out.println("test component 1");
    }

}
