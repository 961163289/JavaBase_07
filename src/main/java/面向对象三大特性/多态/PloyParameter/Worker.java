package 面向对象三大特性.多态.PloyParameter;

public class Worker extends Employee {

    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("普通员工 " + getName() + " is working.");
    }

    //因为普通员工没有其他收入,则直接调用父类方法
    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
