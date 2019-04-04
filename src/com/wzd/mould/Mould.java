package com.wzd.mould;

/**
 * @author ：Administrator
 * @title :Mould
 * @projectName :JavaDesignMode
 * @description：模板设计模式抽象类
 * @version: 1.0
 * @date ：Created in 2019/04/04/0004 9:15
 * @modified By：
 */
public abstract class Mould {
    public final void makeFood(){
        washFood();
        cutUp();
        cooking();
    }

    abstract void washFood();
    abstract  void cutUp();
    abstract void cooking();
}
