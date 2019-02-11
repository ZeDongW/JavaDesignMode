package com.wzd.decker.painting;

/**
 * @author ：ZeDongW
 * @version : 1.0
 * @ClassName : Mother
 * @description：妈妈会上色
 * @modified By：
 * @date ：Created in 2019/02/11/0011 17:52
 */
public class Mother extends Draw{
    private Draw draw;
    public Mother(Draw draw){
        this.draw = draw;
    }

    @Override
    public void draw() {
        draw.draw();
        System.out.println("给画上色");
    }
}
