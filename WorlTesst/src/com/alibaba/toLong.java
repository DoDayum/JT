package com.alibaba;

import java.io.UnsupportedEncodingException;

/**
 * @author BaiYu
 * @version 1.0
 * @date 2020/12/30 22:15
 */
public class toLong {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String a = "人事部";


        byte[] gbks = a.getBytes("utf-8");
        for (int i = 0;i<gbks.length;i++) {
            System.out.println(Integer.toBinaryString(gbks[i]));
        }
        String s = new String(gbks);

        System.out.println(gbks);
        System.out.println(s);
    }

}
