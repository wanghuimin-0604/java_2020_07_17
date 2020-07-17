package test2;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-17
 * Time:16:49
 * 一万年太久，只争朝夕，加油
 */
class Student implements Comparable<Student> {

    private String name;
    private int age;
    private int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //指定排序的规则
        //return this.score - o.score;
        return o.age-this.age;

    }
}
public class Test {
        public static void main(String[] args) {
            Student[] students=new Student[3];
            students[0] = new Student("张三", 16, 88);
            students[1] = new Student("李四", 17, 92);
            students[2] = new Student("王五", 16, 90);
            Arrays.sort(students);
            System.out.println(Arrays.toString(students));

        }
    }