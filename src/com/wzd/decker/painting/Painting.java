package com.wzd.decker.painting;

/**
 * @author ：ZeDongW
 * @version : 1.0
 * @ClassName : Painting
 * @description：画画
 * @modified By：
 * @date ：Created in 2019/02/11/0011 17:56
 */
public class Painting {
    public static void main(String[] args) {
        Draw draw = new Draw();
        Son son = new Son(draw);
        Mother mother = new Mother(son);
        Father father = new Father(mother);
        father.draw();
    }
}
