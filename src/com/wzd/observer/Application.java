package com.wzd.observer;

import java.util.ArrayList;

/**
 * @author ：Administrator
 * @title :Application
 * @projectName :JavaDesignMode
 * @description：观察者设计模式入口
 * @version: 1.0
 * @date ：Created in 2019/04/03/0003 22:48
 * @modified By：
 */
public class Application {
    public static void main(String[] args) {
        Students stu = new Students("110", "小明");
        Emp emp = new Emp("220","李华");
        ArrayList<Weather> weathers = new ArrayList<>();
        weathers.add(stu);
        weathers.add(emp);
        WeatherStation weatherStation = new WeatherStation(weathers);
        weatherStation.updateWesther();
    }
}
