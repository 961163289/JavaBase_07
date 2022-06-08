package 课堂练习;

public class Homework03 {
    public static void main(String[] args) {
        Professor professor = new Professor("贾宝玉", 50, "高级职称", 30000, 1.3);
        professor.introduce();
        AssociateProfessor associateProfessor = new AssociateProfessor("贾宝玉", 40, "中级职称", 15000, 1.2);
        associateProfessor.introduce();
        Lecturer lecturer = new Lecturer("贾宝玉", 25, "普通教员", 8000, 1.1);
        lecturer.introduce();
    }
}

//子类
class Professor extends Teacher {
    //特有属性
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("教授信息~~~");
        super.introduce();
    }
}

class AssociateProfessor extends Teacher {
    //特有属性
    public AssociateProfessor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("副教授信息~~~");
        super.introduce();
    }
}

class Lecturer extends Teacher {
    //特有属性
    public Lecturer(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("讲师信息~~~");
        super.introduce();
    }
}

/*
(1) 要求有属性“姓名name”，“年龄age”，“职称post”，“基本工资salary”
(2) 编写业务方法， introduce（），实现输出一个教师的信息。
 */
class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
    private double grade;

    public Teacher(String name, int age, String post, double salary, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void introduce() {
        System.out.println("Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                ", grade=" + grade +
                '}');
    }
}
