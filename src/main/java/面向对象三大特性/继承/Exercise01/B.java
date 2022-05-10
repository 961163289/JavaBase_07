package 面向对象三大特性.继承.Exercise01;

public class B extends A {

    public B() {
        this("abc");
        System.out.println("b");
    }

    public B(String name) {
        System.out.println("b name");
    }

}
