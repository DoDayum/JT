package com.baiyu.java;



/**
 * @author BaiYu
 * @version 1.0
 * @date 2020/12/21 10:53
 */
// 必须定义 `ShowMeBug` 入口类和 `public static void main(String[] args)` 入口方法
public class Test12 {
    public static Result find(int data[], int sum) {
        /**
         BaiYu
         verson 01
         2020.12.21

         int data[] = { 1, 2, 4, 7, 12, 15 };
         int sum = 14;
         */
        boolean a = false;
        Result result = new Result();
        for(int i = 0;i<data.length;i++){
            for (int j = i;j<data.length;j++){
                if ((data[i]+data[j]) == sum){
                    result.setNum1(data[i]);
                    result.setNum2(data[j]);
                    a = true;
                }
            }
        }
        if (a == true){
            return result;
        }
        else {
            return null;
        }
    }
    public static class Result {
        private int num1 ;
        private int num2 ;
        private boolean sucess ;
        public int getNum1() {
            return num1;
        }
        public void setNum1(int num1) {
            this.num1 = num1;
        }
        public int getNum2() {
            return num2;
        }
        public void setNum2(int num2) {
            this.num2 = num2;
        }
        public boolean isSucess() {
            return sucess;
        }
        public void setSucess(boolean sucess) {
            this.sucess = sucess;
        }
    }
    public static void main(String[] args) {
        int data[] = { 1, 2, 4, 7, 12, 15 };
        int sum = 14;
        Result rs = find(data, sum);
        if (null != rs) {
            System.out.println("found:" + rs.isSucess() + "," + rs.getNum1() + ","
                    + rs.getNum2());
        } else {
            System.out.println("found: null");
        }
    }
}