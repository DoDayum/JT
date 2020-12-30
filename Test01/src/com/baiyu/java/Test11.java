package com.baiyu.java;

/**
 * @author BaiYu
 * @version 1.0
 * @date 2020/12/18 20:13
 */
public class Test11 {

    public static void main(String[] args) {
        B11 b11 = new B11();
//        System.out.println(b11);
    }

}

class A11 {
    static String a = "a";
    {
        System.out.println("a的代码块");
    }
}

class B11 extends A11{
    static String a = "b";
    {
        System.out.println("b的代码块");
    }
}
