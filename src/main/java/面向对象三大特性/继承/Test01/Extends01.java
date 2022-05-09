package 面向对象三大特性.继承.Test01;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "银角大王";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(99);
        pupil.showInfo();

        System.out.println("========================================");

        Graduate graduate = new Graduate();
        graduate.name = "金角大王";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(85);
        graduate.showInfo();
    }
}
