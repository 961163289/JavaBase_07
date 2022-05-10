package 面向对象三大特性.继承.Exercise03;

//编写 NotePad 子类，继承 Computer 类，添加特有属性【color】
public class NotePad extends Computer {

    private String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.println("NotePad信息:");
        System.out.println(getCpu() + " " + getMemory() + " " + getDisk());
        System.out.println(getDetails() + ", color = " + color);
    }
}
