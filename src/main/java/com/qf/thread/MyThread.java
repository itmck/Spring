package com.qf.thread;

/**
 * Create by it_mck 2018/8/11 16:30
 *
 * @Description:
 * @Version: 1.0
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<2000;i++){

            System.out.println(i);
        }
    }
}
