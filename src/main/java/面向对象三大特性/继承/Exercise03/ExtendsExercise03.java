package 面向对象三大特性.继承.Exercise03;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("inter", 16, 500, "IBM");
        pc.printInfo();

        NotePad notePad = new NotePad("inter", 32, 1024, "Black");
        notePad.printInfo();
    }
}
