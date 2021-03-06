package 面向对象三大特性.多态.PloyParameter;

public class PloyParameter {
    public static void main(String[] args) {

        Worker worker = new Worker("tom", 2500);
        Manager milan = new Manager("milan", 5000, 200000);
        PloyParameter ploy = new PloyParameter();
        ploy.showEmpAnnual(worker);
        ploy.showEmpAnnual(milan);
        ploy.testWork(worker);
        ploy.testWork(milan);

    }

    //实现获取任何员工对象的年工资,并在 main 方法中调用该方法
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());//动态绑定机制
    }

    //添加一个方法, testWork, 如果是普通员工,则调用 work 方法,如果是经理,则调用 manage 方法
    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work();//向下转型操作
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println("不做处理...");
        }
    }
}
