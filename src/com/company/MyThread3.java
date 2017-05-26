package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by pavel on 30/03/2017.
 */
public class MyThread3 extends Thread {

    private Random rand;
    private int limit;
    private long time;
    private Track track;

    public MyThread3(int limit, long time, Track track) {
        this.limit = limit;
        this.time = time;
        this.rand = new Random();
        this.track = track;
    }

    public void run() {
        try {
            PrintWriter writer = new PrintWriter("third.log", "UTF-8");
            int counter = 0;
            for (int i = 0; i < 10; i++) {
                try {
                    track.setTrackThird(rand.nextInt(limit + 1));
                    writer.println(track.getTrackThird());
                    sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            writer.close();
            System.out.println("Thread3 terminated");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
