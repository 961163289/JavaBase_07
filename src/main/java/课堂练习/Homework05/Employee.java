package 课堂练习.Homework05;

public class Employee {
    //属性
    //分析有一个带薪的月份
    private String name;
    private double sal;
    private int salMonth = 12;

    //方法
    //打印全年工资
    public void printSal() {
        System.out.println(name + " 年薪 = " + (sal * salMonth));
    }

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }
}
