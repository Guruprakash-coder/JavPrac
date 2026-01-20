package oop5.interfaces;

public class CDplayer implements Media {

    @Override
    public void start() {
        System.out.println("car music player started");
    }

    @Override
    public void stop() {
        System.out.println("car music player stopped");
    }
}
