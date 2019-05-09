package test.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectjTest {

    @Pointcut("execution( * test.test.BeanTest.*())")
    public void test(){}

    @Before("test()")
    public void beforeTest() {
        System.out.println("before Test");
    }

    @After("test()")
    public void after() {
        System.out.println("after Test");
    }

    @Around("test()")
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("before around");
        Object object= null;
        try {
             object = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("after around");

        return object;
    }



}
