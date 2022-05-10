package 面向对象三大特性.继承.Exercise02;

public class C extends B{
    public C() {
        this("hello");
        System.out.println("我是 C 类的无参构造");
    }

    public C(String name) {
        super("hahaha");
        System.out.println(name + ", 我是 C 类的有参构造");
    }
}
