package 面向对象三大特性.多态.PolyDetail01;

public class Cat extends Animal {

    public void eat() {
        System.out.println("猫吃鱼");
    }

    //Cat特有方法
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }

}
