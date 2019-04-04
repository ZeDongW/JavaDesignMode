package com.wzd.mould;

/**
 * @author ：ZeDongW
 * @title :Application
 * @projectName :JavaDesignMode
 * @description：模板设计模式应用入口
 * @version: 1.0
 * @date ：Created in 2019/04/04/0004 7:44
 * @modified By：
 */
public class Application {
    public static void main(String[] args) {
        MakeTomato makeTomato = new MakeTomato();
        MakeBeef makeBeef = new MakeBeef();
        makeTomato.makeFood();
        makeBeef.makeFood();
    }
}
