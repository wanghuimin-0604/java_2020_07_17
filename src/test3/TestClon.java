package test3;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-17
 * Time:17:02
 * 一万年太久，只争朝夕，加油
 */
class Student implements Cloneable{
    public String name;
    private int age;
    private String sex;

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    //重写该接口中的克隆方法
    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }
}
public class TestClon {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1=new Student("张三",29,"男");
        Student s2= s1.clone();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("############");
        s1.name="王五";
        System.out.println(s1);
        System.out.println(s2);


    }
}
