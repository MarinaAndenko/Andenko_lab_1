package com.company;

public class Main {

    public static void main(String[] args) {
        Track tracking = new Track();
        Thread t1 = new MyThread1(100, 200, tracking);
        Thread t2 = new MyThread2(100, 200, tracking);
        Thread t3 = new MyThread3(100, 200, tracking);
        Thread t4 = new MyThread4(tracking);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}