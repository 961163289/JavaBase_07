package Object类;

public class EqualsExercise02 {
    public static void main(String[] args) {

        Student p1 = new Student();
        p1.name = "hspedu";
        Student p2 = new Student();
        p2.name = "hspedu";

        System.out.println(p1 == p2);//false
        System.out.println(p1.equals(p2));//false
        System.out.println(p1.name.equals(p2.name));//true

        String s1 = new String("asdf");
        String s2 = new String("asdf");

        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true

    }
}

class Student {
    public String name;
}
