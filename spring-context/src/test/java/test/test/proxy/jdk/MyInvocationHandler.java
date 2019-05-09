package test.test.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Title: MyInvocationHandler
 * Description:
 *
 * @author: 天爱有情
 * @date: 2019/1/30 10:19
 **/
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用目标对象之前
        System.out.println("------------------before-------------");

        Object result = method.invoke(target, args);

        // 调用目标对象之后
        System.out.println("------------------after-------------");
        return result;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }
}
