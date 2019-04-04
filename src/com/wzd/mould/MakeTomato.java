package com.wzd.mould;

/**
 * @author ：ZeDongW
 * @title :MakeTomato
 * @projectName :JavaDesignMode
 * @description：模板设计模式之炒番茄
 * @version: 1.0
 * @date ：Created in 2019/04/04/0004 7:40
 * @modified By：
 */
public class MakeTomato extends Mould{
    @Override
    public void washFood() {
        System.out.println("洗干净番茄");
    }

    @Override
    public void cutUp() {
        System.out.println("切番茄");
    }

    @Override
    public void cooking() {
        System.out.println("炒番茄");
    }
}
