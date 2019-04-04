package com.wzd.observer;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author ：Administrator
 * @title :WeatherStation
 * @projectName :JavaDesignMode
 * @description：气象台
 * @version: 1.0
 * @date ：Created in 2019/04/03/0003 22:21
 * @modified By：
 */
public class WeatherStation {
    private static String[] Weathers = {"小雨","晴天","下雪"};
    private static String weather;
    ArrayList<Weather> list;

    public WeatherStation(ArrayList<Weather> list) {
        this.list = list;
    }

    static Random random = new Random();
    public void updateWesther(){
        new Thread(){
            @Override
            public void run() {
                while(true){
                    weather = Weathers[random.nextInt(Weathers.length)];
                    System.out.println("当前天气" + weather );
                    for (Weather weather1 : list) {
                        weather1.notifyweather(weather);
                    }
                    try {
                        Thread.sleep(random.nextInt(501) + 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
