package com.company;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-17
 * Time:16:23
 * 一万年太久，只争朝夕，加油
 */
public class Person implements Student {
    public String name;
    @Override
    public void show() {
        System.out.println(name+"is "+age+" years old");
    }
}
