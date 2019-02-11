package com.wzd.decker.painting;

/**
 * @author ：ZeDongW
 * @version : 1.0
 * @ClassName : Father
 * @description：爸爸给画装裱
 * @modified By：
 * @date ：Created in 2019/02/11/0011 17:54
 */
public class Father extends Draw{
    private Draw draw;
    public Father(Draw draw){
        this.draw = draw;
    }

    @Override
    public void draw() {
        draw.draw();
        System.out.println("给画装裱");
    }
}
