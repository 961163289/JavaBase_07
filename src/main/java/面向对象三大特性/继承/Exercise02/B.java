package 面向对象三大特性.继承.Exercise02;

public class B extends A{
    public B() {
        System.out.println("我是 B 类的无参构造");
    }

    public B(String name) {
        System.out.println(name + ", 我是 B 类的有参构造");
    }
}
