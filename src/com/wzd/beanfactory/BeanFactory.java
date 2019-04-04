package com.wzd.beanfactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @author ：Administrator
 * @title :BeanFactory
 * @projectName :JavaDesignMode
 * @description：工厂设计模式
 * @version: 1.0
 * @date ：Created in 2019/04/04/0004 11:49
 * @modified By：
 */
public class BeanFactory {
    public static void main(String[] args) throws Exception{
        Person p = getInstance();
        System.out.println(p);
    }

    private static Person getInstance() throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\com\\wzd\\beanfactory\\person.txt"));
        String className = bufferedReader.readLine();
        Class clazz = Class.forName(className);
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Person p = (Person)constructor.newInstance();
        String line = null;
        while((line = bufferedReader.readLine()) != null){
            String[] split = line.split("=");
            Field field = clazz.getDeclaredField(split[0]);
            field.setAccessible(true);
            if(int.class.equals(field.getType())){
                field.set(p,Integer.parseInt(split[1]));
            } else {
                field.set(p,split[1]);
            }
        }
        return p;
    }
}
