package 面向对象三大特性.多态.PloyMethod;

public class PloyMethod {
    public static void main(String[] args) {
        //方法重载体现多态
        A a = new A();
        //这里我们传入不同的参数,就会调用不同 sum 方法,就体现多态
        System.out.println(a.sum(10, 20));
        System.out.println(a.sum(10, 20, 30));

        //方法重写体现多态
        B b = new B();
        a.say();
        b.say();
    }
}
