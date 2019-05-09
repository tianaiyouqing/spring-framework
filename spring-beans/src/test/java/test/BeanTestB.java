package test;

public class BeanTestB {

    private BeanTest beanTest;

    public BeanTest getBeanTest() {
        return beanTest;
    }

    public void setBeanTest(BeanTest beanTest) {
        this.beanTest = beanTest;
    }

    private String str = "hello spring B";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
