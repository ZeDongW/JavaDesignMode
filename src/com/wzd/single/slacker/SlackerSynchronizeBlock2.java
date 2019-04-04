package com.wzd.single.slacker;

/**
 * @author ：ZeDongW
 * @title :SlackerSynchronizeBlock2
 * @projectName :JavaDesignMode
 * @description：懒汉单例设计模式，通过同步代码块保证线程安全，提高效率
 * @version: 1.0
 * @date ：Created in 2019/04/03/0003 18:03
 * @modified By：
 */
public class SlackerSynchronizeBlock2 {
    private static SlackerSynchronizeBlock2 s;
    private SlackerSynchronizeBlock2(){}
    public static SlackerSynchronizeBlock2 getInstance(){
        if(s == null){
            synchronized(SlackerSynchronizeBlock2.class){
                if(s == null){
                    s = new SlackerSynchronizeBlock2();
                }
            }
        }
        return s;
    }
}
