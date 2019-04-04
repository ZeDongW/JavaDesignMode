package com.wzd.mould;

/**
 * @author ：Administrator
 * @title :makeBeef
 * @projectName :JavaDesignMode
 * @description：模板设计模式之炒牛肉
 * @version: 1.0
 * @date ：Created in 2019/04/04/0004 7:42
 * @modified By：
 */
public class MakeBeef extends Mould{
    @Override
    public void washFood() {
        System.out.println("洗牛肉");
    }

    @Override
    public void cutUp() {
        System.out.println("切牛肉");
    }

    @Override
    public void cooking() {
        System.out.println("炒牛肉");
    }
}
