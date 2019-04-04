package com.wzd.single.hungry;

/**
 * @author ：Administrator
 * @title :Hungry
 * @projectName :JavaDesignMode
 * @description：饿汉单例设计模式
 * @version: 1.0
 * @date ：Created in 2019/04/03/0003 17:26
 * @modified By：
 */
public class Hungry {
    private static Hungry h = new Hungry();

    private Hungry(){}

    public static Hungry getInstance(){
        return h;
    }
}
