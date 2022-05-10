package super关键字;

public class A extends Base {

    //4个属性
//    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public A() {

    }

    public A(String name) {
        System.out.println("A类 A(String name)");
    }

    public A(String name, int age) {
    }

    public void cal() {
        System.out.println("A 类的 cal() 方法...");
    }

    public void test100() {
    }

    protected void test200() {
    }

    void test300() {
    }

    private void test400() {
    }

}
