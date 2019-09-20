package test.tianai.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

//@Component
//@DependsOn("testComponent1")
public class TestComponent2 {

    @Autowired
    private TestComponent1 testComponent1;

    public TestComponent2() {
    }

    public void test1() {
        System.out.println("component 2 start" );
        testComponent1.test1();
        System.out.println("component 2 end");
    }
}
