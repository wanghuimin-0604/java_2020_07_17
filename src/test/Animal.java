package test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-17
 * Time:16:32
 * 一万年太久，只争朝夕，加油
 */
public abstract class Animal {
    /**
     * 这是一个抽象类
     * 抽象类：
     * 1、用abstract关键字修饰
     * 2、不能被实例化，只能由继承它的子类来进行实例化
     * 3、抽象类中可以有普通的成员遍历和方法
     * 4、父类和子类之间用extends来联系
     * 5、一个类继承抽象类，必须重写抽象类中的所有抽象方法
     * 6、抽象方法不能是private或者static
     * 7、抽象类不能用final修饰，final修饰的类是不能被继承的，final修饰的变量是常量并不能再更改
     */
    public int age=3;
    public void method(){
        System.out.println("这是一个动物");
    }
    public abstract void  method2();

}
