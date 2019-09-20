package test;


public class BeanTest {


    private BeanTestB beanTestB;

    public BeanTestB getBeanTestB() {
        return beanTestB;
    }

    public void setBeanTestB(BeanTestB beanTestB) {
        this.beanTestB = beanTestB;
    }

    private String str = "hello spring";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
