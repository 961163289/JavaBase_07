package 课堂练习;

/**
 * 1.定义一个Person类 {name,age,job}, 初始化Person 对象数组,有 3个 Person对象,
 * 并按照 age 从大到小进行排序,提示:使用冒泡排序
 */
public class Homework01 {
    public static void main(String[] args) {

        //初始化 Person 对象数组, 有 3个 person对象
        Person[] persons = new Person[3];
        persons[0] = new Person("mary", 50, "Java工程师");
        persons[1] = new Person("smith", 25, "大数据工程师");
        persons[2] = new Person("tom", 30, "PHP工程师");

        //输出当前对象数组
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]); //默认对象的.toString()
        }

        //使用冒泡排序
        Person tmp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - i - 1; j++) {
                //并按照 age 从大到小进行排序, 如果前面的人的 age < 后面的人的 age,就交换
//                if (persons[j].getAge() < persons[j + 1].getAge()) {
//                    tmp = persons[j];
//                    persons[j] = persons[j + 1];
//                    persons[j + 1] = tmp;
//                }
                //要求按照名字的长度从小到大 if(persons[i].getName().length() > persons[i+1].getName().length())
                if(persons[i].getName().length() > persons[i+1].getName().length()){
                    tmp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = tmp;
                }
            }
        }

        System.out.println("排序后的效果:");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]); //默认对象的.toString()
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}

/**
 * 2.写出四种访问权限修饰符和各自的访问权限
 * 访问控制修饰符   同类    同包    子类    不同包
 *  public         √       √       √       √
 *  protected      √       √       √       ×
 *  default        √       √       ×       ×
 *  private        √       ×       ×       ×
 */
