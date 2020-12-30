package com.baiyu.java;

public class Test05 {

    String str=new String("tarena");
    char[]ch={'a','b','c'};
    public static void main(String args[]){
        Test05 ex=new Test05();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[]){
        //引用类型变量，传递的是地址，属于引用传递。
        str="test ok";
        ch[0]='g';
    }

}
