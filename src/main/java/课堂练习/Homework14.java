package 课堂练习;

public class Homework14 {
    public static void main(String[] args) {
        C c = new C();
        /**
         * 我是A类
         * hahaha我是B类的有参构造
         * 我是C类的有参构造
         * 我是C类的无参构造
         */
    }
}

class A {
    public A() {
        System.out.println("我是A类");//1
    }
}

class B extends A {
    public B() {
        System.out.println("我是B类的无参构造");
    }

    public B(String name) {
        System.out.println(name + "我是B类的有参构造");//2
    }
}

class C extends B {
    public C() {
        this("hello");
        System.out.println("我是C类的无参构造");//4
    }

    public C(String name) {
        super("hahaha");
        System.out.println("我是C类的有参构造");//3
    }
}
