package com.company;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pavel on 30/03/2017.
 */
public class MyThread4 extends Thread {

    private Track track;

    public MyThread4(Track track) {
        this.track = track;
    }

    public void run() {
        try {
            PrintWriter writer = new PrintWriter("four.log");
            for (int i = 0; i < 100; i++) {
                if (track.getTrackFirst() == track.getTrackSecond()) {
                    writer.println("Equals: " + track.getTrackFirst() + " " + track.getTrackSecond());
                } else if (track.getTrackFirst() == track.getTrackThird()) {
                    writer.println("Equals: " + track.getTrackFirst() + " " + track.getTrackThird());
                } else if (track.getTrackSecond() == track.getTrackThird()) {
                    writer.println("Equals: " + track.getTrackSecond() + " " + track.getTrackThird());
                }
                sleep(100);
            }
            writer.close();
            System.out.println("Thread4 terminated");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
