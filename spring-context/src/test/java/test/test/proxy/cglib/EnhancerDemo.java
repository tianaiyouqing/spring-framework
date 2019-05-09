package test.test.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Title: EnhancerDemo
 * Description:
 *
 * @author: 天爱有情
 * @date: 2019/1/30 10:47
 **/
public class EnhancerDemo {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(EnhancerDemo.class);
        enhancer.setCallback(new MethodInterceptorImpl());

        EnhancerDemo enhancerDemo = (EnhancerDemo) enhancer.create();

        enhancerDemo.test();

        System.out.println(enhancerDemo);
    }


    public void test() {
        System.out.println("EnhancerDemo test");
    }

    private static class MethodInterceptorImpl implements MethodInterceptor {

        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("Before invoke" + method);

            Object result = methodProxy.invokeSuper(o, objects);

            System.out.println("After invoke" + method);

            return result;
        }
    }
}
