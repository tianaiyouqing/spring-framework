package test.test.proxy.aoptest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Title: JdkAop
 * Description:
 *
 * @author: 天爱有情
 * @date: 2019/5/9 13:12
 **/
public class JdkAop implements InvocationHandler {

    private Object target;

    public Object getProxy(Class clazz) throws IllegalAccessException, InstantiationException {
        target = clazz.newInstance();
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("------------------jdk before-------------");

        Object result = method.invoke(target, args);

        // 调用目标对象之后
        System.out.println("------------------jdk after-------------");
        return result;
    }
}
