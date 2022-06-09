package 课堂练习.Homework10;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    /**
     * 重写父类(Object)的equals()方法：public boolean equals(Object obj)，
     * 并判断测试类中创建的两个对象是否相等。相等就是判断属性是否相同
     */
    @Override
    public boolean equals(Object obj) {
        //判断两个比较对象是否相同
        if (this == obj) {
            return true;
        }
        //判断 obj 是否是 Doctor类型或其子类
        //过关斩将 校验方式
        if (!(obj instanceof Doctor)) { //不是的话
            return false;
        }
        //向下转型,因为 obj 的运行类型是 Doctor 或者其子类型
        Doctor doctor = (Doctor) obj;
        return this.name.equals(doctor.name) && this.age == doctor.age &&
                this.gender == doctor.gender && this.job.equals(doctor.job) && this.sal == doctor.sal;
    }
}
