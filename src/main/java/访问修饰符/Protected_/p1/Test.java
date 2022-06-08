package 访问修饰符.Protected_.p1;

import 访问修饰符.Protected_.p2.Son2;

public class Test {
    public static void main(String[] args) throws Exception {

        Son1 son1 = new Son1();
        son1.f();
        son1.g();

        Son2 son2 = new Son2();
        son2.f();
        //son2.g();

        Test t = new Test();
        t.clone();

    }
}
