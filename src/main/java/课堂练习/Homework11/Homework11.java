package 课堂练习.Homework11;

public class Homework11 {
    public static void main(String[] args) {
        //向上转型: 父类的引用指向子类的对象
        Person p = new Student();
        p.run();//Student run
        p.eat();//person eat
        //p.study(); //错误,无法调用
        //向下转型: 把指向子类对象的父类引用, 转成指向子类对象的子类引用
        Student s = (Student) p;
        s.run();  //Student run
        s.study();//Student study
    }
}

//父类
class Person {
    public void run() {
        System.out.println("person run");
    }

    public void eat() {
        System.out.println("person eat");
    }
}

class Student extends Person {
    public void run() {
        System.out.println("Student run");
    }

    public void study() {
        System.out.println("Student study");
    }
}
