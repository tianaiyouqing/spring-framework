package test.tianai;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import test.tianai.component.TestComponent1;
import test.tianai.component.TestComponent2;

public class TestMain {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext("test.tianai.component");
        ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();
        TestComponent1 bean = applicationContext.getBean(TestComponent1.class);
        bean.test1();
    }
}
