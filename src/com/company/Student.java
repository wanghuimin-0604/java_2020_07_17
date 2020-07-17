package com.company;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-17
 * Time:16:16
 * 一万年太久，只争朝夕，加油
 */
public interface Student {
    /**
     * 这是一个学生类接口
     *     接口
     *     1、修饰符：interface
     *     2、接口中只能定义抽象方法(抽象方法是没有方法体的），不能定义普通的成员方法
     *     3、接口中可以定义常量，不能定义成员变量
     *     4、接口不能实例化，必须有一个类来实现它
     *     5、一个类实现该接口，必须实现该接口中的方法（抽象方法）
     *     6、一个类可以实现多个接口(解决了java中类的但继承问题
     *     7、实现类和接口用implements关键字来联系
     *
     */

    public static final int age=5;
    public abstract void show();
    public static void show2(){
        System.out.println(age);
    }
    default void show3(){

    }
}
