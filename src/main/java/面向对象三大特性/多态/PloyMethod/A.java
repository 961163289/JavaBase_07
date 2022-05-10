package 面向对象三大特性.多态.PloyMethod;

public class A extends B {

    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    //与上面的 sum 构成重载
    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public void say() {
        System.out.println("A say() 方法被调用...");
    }

}
