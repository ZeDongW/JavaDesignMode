package com.wzd.single.slacker;

/**
 * @author ：ZeDongW
 * @title :SlackerSynchronizeMethod
 * @projectName :JavaDesignMode
 * @description：使用同步函数保证线程安全，效率低
 * @version: 1.0
 * @date ：Created in 2019/04/03/0003 17:34
 * @modified By：
 */
public class SlackerSynchronizeMethod {
    private static SlackerSynchronizeMethod s;
    private SlackerSynchronizeMethod(){}
    public static synchronized SlackerSynchronizeMethod getInstance(){
        if(s == null){
            s = new SlackerSynchronizeMethod();
        }
        return s;
    }
}
