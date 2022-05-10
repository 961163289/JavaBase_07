package 面向对象三大特性.多态.DynamicBinding;

//子类
public class B extends A {

    public int i = 20;

    public int getI() {
        return i;
    }

    public int sum() {
        return i + 20;
    }

    public int sum1() {
        return i + 10;
    }

}
