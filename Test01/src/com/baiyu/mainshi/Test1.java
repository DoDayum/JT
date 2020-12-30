package com.baiyu.mainshi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 找出最长对称字符串
 *
 * @author 白宇
 */
public class Test1 {
    public static void main(String[] args) {

        // TODO 输出最长对称字符串：goog
        String input1 = "google";
        System.out.println("##########第一题##########");
        int a = 0;//开始对称的数
        LinkedList linkedList = new LinkedList();
        char[] charsI = input1.toCharArray();
        for (int i = 0; i < charsI.length - 1; i++) {
            if (charsI[i] == charsI[i + 1]) {
                a = i;
            }
        }
        for (int i = 0; i < charsI.length - 1; i++) {
            if (a-i == 0){
                break;
            }
		    if (charsI[a-i] == charsI[a+i+1]){
		        linkedList.add(i);
            }
        }
        for (int i = 0;i<linkedList.size();i++){
            System.out.print(charsI[(int)linkedList.get(i)]);
        }
        System.out.print(charsI[a]);
        System.out.print(charsI[a]);
        for (int i = linkedList.size();i>0;i--){
            System.out.print(charsI[(int)linkedList.get(i-1)]);
        }


        // TODO 输出3个最长对称字符串：aba/aca/ada
        String input2 = "abcda";

        System.out.println("\n##########第二题##########");
        String input2R = new StringBuffer(input2).reverse().toString();//字符反转
        char[] input2char = input2.toCharArray();
        char[] input2Rchar = input2R.toCharArray();
        LinkedList linkedList2 = new LinkedList();//记录哪些有对称
        int test2;
        if (input2char.length%2==1){//判断位数是基数还是偶数
            test2 = input2char.length/2+1;
        }else {
            test2 = input2char.length/2;
        }
        for (int i = 0;i<test2;i++){//获取对称字符
            if (input2char[i] == input2Rchar[i]){
                linkedList2.add(input2char[i]);
            }
        }
        //打印输出
        for ( Object c:linkedList2){
            System.out.print(c);
        }
        for (int i = 0; i <linkedList2.size()-1; i++) {
            System.out.print(linkedList2.get(i));
        }





        // TODO 输出2个最长对称字符串：pop/upu，不会输出特殊字符的对称字符串p-p
        String input3 = "pop-upu";

        System.out.println("\n##########第三题##########");
        List<String> list = new ArrayList<>();

    }
}
