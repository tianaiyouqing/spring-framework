package test.test.proxy.aoptest;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Title: CglibAop
 * Description:
 *
 * @author: 天爱有情
 * @date: 2019/5/9 13:07
 **/
public class CglibAop implements MethodInterceptor {

    public Object getProxy(Class clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        enhancer.setCallbackType(CglibAop.class);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib start");
        final Object res = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib end");
        return res;
    }
}
