package 课堂练习;

public class Homework07 {
    public static void main(String[] args) {

    }
}

//父类
class Test {
    String name = "Rose";

    Test() {
        System.out.println("Test");
    }

    Test(String name) {//name john
        this.name = name;//这里把父类的 name 修改 john
    }
}

//子类
class Demo extends Test {
    String name = "Jack";

    Demo() {
        super();
        System.out.println("Demo");
    }

    Demo(String name) {
        super(name);
    }

    public void test() {
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        new Demo().test();//Test Demo Rose Jack
        new Demo("john").test();//john jack
    }
}
