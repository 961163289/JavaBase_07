package 课堂练习;

public class Homework04 {
    public static void main(String[] args) {
        Manager manager = new Manager("刘备", 100, 20, 1.2);
        //设置奖金
        manager.setBonus(3000);
        //打印经理的工资情况
        manager.printSal();

        Manager manager2 = new Manager("张飞", 120, 10, 1.2, 5000);
        manager2.printSal();

        Worker worker = new Worker("关羽", 50, 10, 1.0);
        worker.printSal();
    }
}

class Manager extends Employee {
    //特有属性
    private double bonus;

    //创建Manager对象时,奖金是多少并不是确定的,因此在构造器中,不给bonus.可以通过setBouns
    public Manager(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    //在构造方法中设置 bonus
    public Manager(String name, double daySal, int workDays, double grade, double bonus) {
        super(name, daySal, workDays, grade);
        this.bonus = bonus;
    }

    //方法: 重写父类的 printSal
    @Override
    public void printSal() {
        //因为经理的工资计算方式和 Employee 不一样,所以我们重写
        System.out.println("经理: " + getName() + " 工资 = " + (bonus + getDaySal() * getWorkDays() * getGrade()));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

class Worker extends Employee {
    //分析:普通员工没有特有的属性
    public Worker(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    //重写 printSal
    //因为普通员工和Employee输出工资情况一样,所以直接调用父类的printSal()
    @Override
    public void printSal() {
        System.out.print("普通员工: "); //自己的输出信息
        super.printSal(); //调用父类的方法,复用代码
    }
}

class Employee {
    //属性
    //员工属性: 姓名, 单日工资, 工作天数
    private String name;
    private double daySal;
    private int workDays;
    //分析出还有一个属性: 等级
    private double grade;

    //方法 [构造器, getter 和 setter]
    public Employee(String name, double daySal, int workDays, double grade) {
        this.name = name;
        this.daySal = daySal;
        this.workDays = workDays;
        this.grade = grade;
    }

    //打印工资方法
    public void printSal() {
        System.out.println(name + " 工资 = " + (daySal * workDays * grade));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }


}
