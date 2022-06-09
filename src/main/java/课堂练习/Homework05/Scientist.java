package 课堂练习.Homework05;

public class Scientist extends Employee {
    //特有属性
    //年终奖 bonus
    private double bonus;

    public Scientist(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void printSal() {
        System.out.print("科学家: ");
        System.out.println(getName() + " 年薪 = " + (getSal() * getSalMonth() + bonus));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
