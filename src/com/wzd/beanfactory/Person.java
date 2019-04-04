package com.wzd.beanfactory;

/**
 * @author ：ZeDongW
 * @title :Person
 * @projectName :JavaDesignMode
 * @description：对象
 * @version: 1.0
 * @date ：Created in 2019/04/04/0004 11:50
 * @modified By：
 */
public class Person {
    private int id;
    private String name;

    private Person(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
