package 面向对象三大特性.多态.Poly01;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("hsy");
        Dog dog = new Dog("旺财");
        Cat cat = new Cat("小白");
        Bone bone = new Bone("骨头");
        Fish fish = new Fish("黄花鱼");
        master.feed(dog, bone);
        master.feed(cat, fish);

    }
}
