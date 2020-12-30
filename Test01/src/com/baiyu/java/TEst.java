package com.baiyu.java;

public class TEst {
    public static void main(String[] args) {
        String a1 = "a";
        String a2 = "a";
        String a3 = a1;
        System.out.println(a1==a2);
        System.out.println(a2==a3);
        System.out.println(a1==a3);
    }
}
