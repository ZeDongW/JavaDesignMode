package com.wzd.single.slacker;

/**
 * @author ：ZeDongW
 * @title :SlackerSynchronizeBlock
 * @projectName :JavaDesignMode
 * @description：懒汉单例设计模式，通过同步代码块保证线程安全，效率低
 * @version: 1.0
 * @date ：Created in 2019/04/03/0003 17:38
 * @modified By：
 */
public class SlackerSynchronizeBlock {
    private static SlackerSynchronizeBlock s;
    private SlackerSynchronizeBlock(){}
    public static SlackerSynchronizeBlock getInstance(){
        synchronized (SlackerSynchronizeBlock.class){
            if(s == null){
                s = new SlackerSynchronizeBlock();
            }
            return s;
        }
    }
}
