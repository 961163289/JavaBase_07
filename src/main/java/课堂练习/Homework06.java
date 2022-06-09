package 课堂练习;

public class Homework06 {
    public static void main(String[] args) {

    }
}

//超类
class Grand {
    String name = "AA";
    private int age = 100;

    public void g1() {
    }
}

//父类
class Father extends Grand {
    String id = "001";
    private double score;

    public void f1() {
        //super 可以访问哪些成员(属性和方法)?
        String name = super.name;
        super.g1();
        //this 可以访问哪些成员
        String id = this.id;
        double score = this.score;
        String name1 = this.name;
        this.f1();
        this.g1();
    }
}

//子类
class Son extends Father {
    String name = "BB";

    public void g1() {
    }

    private void show() {
        //super 可以访问哪些成员(属性和方法)?
        String id = super.id;
        String name = super.name;
        super.f1();
        super.g1();
        //this 可以访问哪些成员
        String name1 = this.name;
        String id1 = this.id;
        this.g1();
        this.f1();
        this.show();
    }
}
