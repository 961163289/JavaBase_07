package 面向对象三大特性.封装;

public class TestAccount {
    public static void main(String[] args) {

        //创建 Account
        Account account = new Account();
        account.setName("jack");
        account.setBalance(60);
        account.setPwd("123456");
        account.showInfo();

    }
}

/**
 * 创建程序,在其中定义两个类：Account 和 AccountTest 类体会 Java 的封装性。
 * Account 类要求具有属性：姓名（长度为 2 位 3 位或 4 位）、余额(必须>20)、
 * 密码（必须是六位）, 如果不满足，则给出提示信息，并给默认值(程序员自己定)
 * 通过 setXxx 的方法给 Account  的属性赋值。
 * 在 AccountTest 中测试
 */

class Account {
    //为了封装，将 3 个属性设置为 private
    private String name;
    private double balance;
    private String pwd;

    //提供两个构造器
    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.name = name;
        this.balance = balance;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 2 || name.length() == 3 || name.length() == 4) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对,需设置为(2-4)位, 默认名字: 无名");
            this.name = "无名";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额(必须>20), 默认为 0");
            this.balance = 0;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码(必须是6位), 默认密码: 123456");
            this.pwd = "123456";
        }
    }

    //显示账号信息
    public void showInfo() {
        //可以增加权限的校验
        System.out.println("账号信息: name = " + name + ", 余额 = " + balance + ", 密码 = " + pwd);
//        if () {
//            System.out.println("账号信息 name=" + name + "  余额=" + balance + " 密码");
//        } else {
//            System.out.println("你无权查看...");
//        }
    }
}