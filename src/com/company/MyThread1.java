package com.company;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pavel on 30/03/2017.
 */
public class MyThread1 extends Thread {

    private int max;
    private long time;
    private Track track;

    public MyThread1(int max, long time, Track track) {
        this.max = max;
        this.time = time;
        this.track = track;
    }

    public void run() {
        try {
            PrintWriter writer = new PrintWriter("first.log", "UTF-8");
            int counter = 0;
            while (counter < max) {
                try {
                    track.setTrackFirst(counter++);
                    writer.println(track.getTrackFirst());
                    sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            writer.close();
            System.out.println("Thread1 terminated");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
