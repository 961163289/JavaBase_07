package 课堂练习.Homework09;

public class LabeledPoint extends Point {
    //特有属性
    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public void show() {
        System.out.println(label + "\t" + getX() + "\t" + getY());
    }
}
