package test.test.proxy.aoptest;

import org.springframework.util.StopWatch;

/**
 * Title: TestMain
 * Description:
 *
 * @author: 天爱有情
 * @date: 2019/5/9 13:16
 **/
public class TestMain {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        CglibAop cglibAop = new CglibAop();

        // cglib test 320

//        for (int i = 0; i < 100; i++) {
//            StopWatch stopWatch = new StopWatch();
//            stopWatch.start();
//            final IAopTest proxy = (IAopTest) cglibAop.getProxy(AopTest.class);
//            proxy.test();
//            stopWatch.stop();
//
//            System.out.println("cglib >>>>" + stopWatch.getTotalTimeMillis());
//        }


        // jdk 6
        for (int i = 0; i < 1; i++) {
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            JdkAop jdkAop = new JdkAop();
            final IAopTest proxy = (IAopTest) jdkAop.getProxy(AopTest.class);
            proxy.test();
            stopWatch.stop();
            System.out.println("jdk >>>>" + stopWatch.getTotalTimeMillis());
        }


//        final IAopTest proxy = (IAopTest) cglibAop.getProxy(AopTest.class);
//        proxy.test();

//        JdkAop jdkAop = new JdkAop();
//        final IAopTest proxy = (IAopTest) jdkAop.getProxy(AopTest.class);
//        proxy.test();


    }





}
