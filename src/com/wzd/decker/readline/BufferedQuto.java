package com.wzd.decker.readline;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author ：ZeDongW
 * @version : 1.0
 * @ClassName : BufferedQuto
 * @description：带有引号的ReedLine()
 * @modified By：
 * @date ：Created in 2019/02/11/0011 15:37
 */
public class BufferedQuto extends BufferedReader {
    private BufferedReader bufferedReader;
    public BufferedQuto(BufferedReader bufferedReader){
        super(bufferedReader);
        this.bufferedReader = bufferedReader;
    }

    @Override
    public String readLine() throws IOException {
        String line = bufferedReader.readLine();
        if (line == null){
            return null;
        }
        return "\"" + line + "\"";
    }
}
