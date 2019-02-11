package com.wzd.decker.readline;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author ：ZeDongW
 * @version : 1.0
 * @ClassName : BufferedLineNum
 * @description：带有行号的ReedLine()
 * @modified By：
 * @date ：Created in 2019/01/28/0028 6:52
 */
public class BufferedLineNum extends BufferedReader {
    private BufferedReader bufferedReader;
    int count;
    public BufferedLineNum(BufferedReader bufferedReader){
        super(bufferedReader);
        this.bufferedReader = bufferedReader;
    }

    @Override
    public String readLine() throws IOException {
        String line = bufferedReader.readLine();
        if (line == null){
            return  null;
        }
        count++;
        return  count + ":" + line;
    }
}
