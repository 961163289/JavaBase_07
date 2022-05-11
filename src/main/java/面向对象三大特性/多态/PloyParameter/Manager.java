package 面向对象三大特性.多态.PloyParameter;

public class Manager extends Employee {

    private double bouns;

    public Manager(String name, double salary, double bouns) {
        super(name, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public void manage() {
        System.out.println("经理 " + getName() + " is managing.");
    }

    //重写获取年薪方法
    @Override
    public double getAnnual() {
        return super.getAnnual() + bouns;
    }
}
