package com.song;

import java.io.IOException;

public class IO3 {
    public static void main(String[] args) throws IOException {
        //直接通过System.in来输入
        byte[] it = new byte[1024];
        int i = System.in.read(it);
        System.out.println(new String(it,0,i-1));
    }
}
