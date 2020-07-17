package test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-17
 * Time:16:38
 * 一万年太久，只争朝夕，加油
 */
public class Dog extends Animal {
    public String name;
    @Override
    public void method2() {
        System.out.println("这只"+name+"已经"+age+"岁啦");
    }
}
