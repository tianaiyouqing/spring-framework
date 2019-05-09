package test.test.proxy.jdk;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Title: ProxyTest
 * Description:
 *
 * @author: 天爱有情
 * @date: 2019/1/30 10:23
 **/
public class ProxyTest {

    @Test
    public void testProxy() {
        UserService userService = new UserServiceImpl();

        // 实例化 invocationHandler
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userService);

        UserService proxy = (UserService) myInvocationHandler.getProxy();
        proxy.add();
    }

    public static void main(String[] args) {
        System.out.println(ArrayList.class.isAssignableFrom(Object.class));
        System.out.println(Object.class.isAssignableFrom(Object.class));
    }
}
