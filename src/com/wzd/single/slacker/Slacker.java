package com.wzd.single.slacker;

import java.util.PrimitiveIterator;

/**
 * @author ：ZeDongW
 * @title :Slacker
 * @projectName :JavaDesignMode
 * @description：懒汉单例设计模式,多线程无法保证单例
 * @version: 1.0
 * @date ：Created in 2019/04/03/0003 17:21
 * @modified By：
 */
public class Slacker {
    private static Slacker s;

    private Slacker() {}

    public static Slacker getInstance(){
        if(s == null){
            s =  new Slacker();
        }
        return s;
    }
}
