package com.baiyu.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author BaiYu
 * @version 1.0
 * @date 2020/12/21 11:17
 */
public class ShowMeBug {


    private double balance = 0; // 账户余额

    /**
     * 存款
     *
     * @param money 存入金额
     */
    public void deposit(double money) {
        //todo
        balance = balance + money;
    }

    /**
     * 获得账户余额
     */
    public double getBalance() {
        return balance;
    }


    public static class Thread01 extends Thread {

        @Override
        public void run() {

        }
    }

    public static ExecutorService service = Executors.newFixedThreadPool(100);

    public static void main(String[] args) {
        ShowMeBug account = new ShowMeBug();
        //todo:100线程并发
        service.execute(new thread01());



        System.out.println("账户余额: " + account.getBalance());
    }
}

class thread01 extends Thread{

    private double money = new ShowMeBug().getBalance();

    @Override
    public void run() {
        ShowMeBug showMeBug = new ShowMeBug();
        showMeBug.deposit(money);
    }
}