package com.qf.thread;

/**
 * Create by it_mck 2018/8/11 16:31
 *
 * @Description:
 * @Version: 1.0
 */
public class ThreadTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread.start();
        myThread2.start();

    }
}
