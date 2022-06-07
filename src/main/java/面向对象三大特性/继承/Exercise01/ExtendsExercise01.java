package 面向对象三大特性.继承.Exercise01;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    public A() {
        System.out.println("a");
    }

    public A(String name) {
        System.out.println("a name");
    }
}

class B extends A {

    public B() {
        this("abc");
        System.out.println("b");
    }

    public B(String name) {
        System.out.println("b name");
    }

}
