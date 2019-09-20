package test;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestMain {


    @Test
    public  void testRun() {

        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("SpringTest.xml"));

        BeanTest beanTest = (BeanTest) xmlBeanFactory.getBean("beanTest");

        System.out.println(beanTest.getStr());
        //new ClassPathXmlApplicationContext()

    }



    public static void main(String[] args) {

        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("SpringTest.xml"));

        BeanTest beanTest = (BeanTest) xmlBeanFactory.getBean("beanTest");

        System.out.println(beanTest.getStr());

    }

    // 1,2,3,4,5
    private static int sum(int[] arr, int index) {
        return index == arr.length? 0 : arr[index] + sum(arr, index+1);
    }

}
