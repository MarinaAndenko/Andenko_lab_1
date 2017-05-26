package com.company;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pavel on 30/03/2017.
 */
public class MyThread2 extends Thread {

    private int start;
    private long time;
    private Track track;

    public MyThread2(int start, long time, Track track) {
        this.start = start;
        this.time = time;
        this.track = track;
    }

    public void run() {
        try {
            PrintWriter writer = new PrintWriter("second.log", "UTF-8");
            int counter = 0;
            while (start > 0) {
                try {
                    start -= counter;
                    track.setTrackSecond(start - counter);
                    writer.println(track.getTrackSecond());
                    counter++;
                    sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            writer.close();
            System.out.println("Thread2 terminated");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
