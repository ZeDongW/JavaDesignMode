package com.wzd.decker.painting;

/**
 * @author ：ZeDongW
 * @version : 1.0
 * @ClassName : Son
 * @description：儿子会素描
 * @modified By：
 * @date ：Created in 2019/02/11/0011 17:48
 */
public class Son extends Draw{
    private Draw draw;
    public Son(Draw draw){
        this.draw = draw;
    }

    @Override
    public void draw() {
        draw.draw();
        System.out.println("画素描");
    }
}
