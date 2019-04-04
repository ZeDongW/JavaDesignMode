package com.wzd.observer;

/**
 * @author ：Administrator
 * @title :Students
 * @projectName :JavaDesignMode
 * @description：学生类
 * @version: 1.0
 * @date ：Created in 2019/04/03/0003 22:34
 * @modified By：
 */
public class Students implements Weather{
    private String id;
    private String name;

    public Students(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void notifyweather(String weather) {
        switch (weather){
            case "晴天":
                System.out.println(this.name + "晴天高高兴兴上学");
                break;
            case "下雨":
                System.out.println(this.name + "下雨打伞上学");
                break;
            case "下雪":
                System.out.println(this.name + "下雪穿羽绒服上学");
        }
    }
}
