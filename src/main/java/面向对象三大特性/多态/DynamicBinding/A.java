package 面向对象三大特性.多态.DynamicBinding;

//父类
public class A {

    public int i = 10;

    public int getI() {
        return i;
    }

    //动态绑定机制
    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }
    
}
