package test.tianai.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

//@Component
public class TestComponent3 implements BeanFactoryPostProcessor, DisposableBean {



    public void test1() {
        System.out.println("this is testcomponent3");
    }


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        beanFactory.ignoreDependencyInterface(TestComponent1.class);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("==================================销毁方法");
    }
}
