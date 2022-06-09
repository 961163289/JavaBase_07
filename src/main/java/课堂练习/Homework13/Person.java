package 课堂练习.Homework13;

/**
 * 抽取一个父类 Person 类, 将共同属性和方法放到 Person 类
 */
public class Person {//父类
    private String name;
    private char gender;
    private int age;

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //编写一个 play 方法,把共有的输出内容写到父类
    public String play() {
        return name + "爱玩";
    }

    //返回一个基本信息
    public String basicInfo() {
        return "姓名: " + name + "\n年龄: " + age + "\n性别: " + gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
