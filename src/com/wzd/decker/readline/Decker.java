package com.wzd.decker.readline;

import java.io.*;

/**
 * @author ：ZeDongW
 * @version : 1.0
 * @ClassName : Decker
 * @description：java装饰着设计模式
 * @modified By：
 * @date ：Created in 2019/01/28/0028 6:48
 */
public class Decker {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src\\com\\wzd\\decker\\Decker.java")));
        BufferedQuto bufferedQuto = new BufferedQuto(bufferedReader);
        BufferedLineNum bufferedLineNum = new BufferedLineNum(bufferedQuto);
        String line = null;
        while ((line = bufferedLineNum.readLine()) != null) {
            System.out.println(line);
        }
    }
}
