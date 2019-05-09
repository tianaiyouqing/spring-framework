package test.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {


    @Test
    public  void testRun() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringTest.xml");

        BeanTest beanTest = (BeanTest) context.getBean("beanTest");

        System.out.println(beanTest.getStr());
        //new ClassPathXmlApplicationContext()

    }
    @Test
    public  void testRun2() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringTest.xml");

        UserMapper userMapper = (UserMapper) context.getBean("userMapper");

        System.out.println(userMapper.getDataValue());
        //new ClassPathXmlApplicationContext()

    }


    @Test
    public  void testRun3() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringTest.xml");

        SimplePostProcessor simplePostProcessor = (SimplePostProcessor) context.getBean("simpleBean");

        System.out.println(simplePostProcessor.toString());
        //new ClassPathXmlApplicationContext()

    }



    @Test
    public  void testRun4() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringTest.xml");

        TestEvent testEvent = new TestEvent("hello", "msg");
        context.publishEvent(testEvent);
        System.out.println("end-------------");
        //new ClassPathXmlApplicationContext()

    }


    @Test
    public void aspectjTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringTest.xml");
        IBeanTest beanTest = (IBeanTest) context.getBean("beanTest");
        beanTest.getStr();

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sum(arr, 0));


    }

    // 1,2,3,4,5
    private static int sum(int[] arr, int index) {
        return index == arr.length? 0 : arr[index] + sum(arr, index+1);
    }

}
