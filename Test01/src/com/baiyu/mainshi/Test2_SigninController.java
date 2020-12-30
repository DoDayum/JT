/**
 * ‎Hangzhou Lejian Technology Co., Ltd.
 * Copyright (c) 2019 All Rights Reserved.
 */
package com.baiyu.mainshi;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 用户注册入口
 *
 * @author 白宇
 */
public class Test2_SigninController {

    /**
     * TODO 请从这里开始补充代码
     * <p>
     * 测试1：138 1234 1234
     * 结果：通过此手机号注册成功
     * <p>
     * 测试2：13812345abc
     * 结果：通知本手机号无法注册，提示为非法手机号
     * <p>
     * 测试3：13812345678
     * 结果：通知此手机号注册成功
     * <p>
     * 测试4：138 1234 5678
     * 结果：提示此手机号已经被其他用户注册
     * <p>
     * 测试5：98765432101
     * 结果：此手机号码为中国大陆非法手机号码
     */

    public static void main(String[] args) {
        /**
         * 哥,你这上来就是MVC项目,其他文件都没有,我就用main搞了
         */

        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        while (true) {
            String s = scanner.nextLine();

            /*去掉空格*/
            String replace = s.replace(" ", "");

            /*设置是否存在*/
            boolean hasNumber = false;
            /*判单是否为手机号*/
            if (replace.matches("\\d{11}")) {
                /*判断是否为中国大陆手机号*/
                if (replace.matches("^[1][3-9]\\d{9}$|^([5|6|9])\\d{7}$|^[0][9]\\d{8}$|^[6]\\d{7}$")) {
                    for (int i = 0; i < list.size(); i++) {
                        if (replace .equals( list.get(i))) {
                            hasNumber = true;
                            break;
                        }
                    }
                    if (hasNumber == false) {
                        list.add(replace);
                        System.out.println("电话存储成功");
                    } else if (hasNumber == true) {
                        System.out.println("提示此手机号已经被其他用户注册");
                    }
                } else {
                    System.out.println("不是中国大陆手机号");
                }
            } else {
                System.out.println("本手机号无法注册，提示为非法手机号");
            }

            for (int i = 0;i<list.size();i++){
                System.out.print(list.get(i)+"\t");
            }
            System.out.println();

        }


    }


}
