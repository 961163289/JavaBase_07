package 面向对象三大特性.多态.DynamicBinding;

public class DynamicBinding {
    public static void main(String[] args) {

        //a 的编译类型 A, 运行类型 B
        A a = new B();//向上转型
        System.out.println(a.sum()); //?40 -> 30
        System.out.println(a.sum1());//?30 -> 20

    }
}
