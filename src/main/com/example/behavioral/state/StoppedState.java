package com.example.behavioral.state;

public class StoppedState implements PlaybackState{
    @Override
    public void play() {
        System.out.println("Starting playback.");
    }

    @Override
    public void pause() {
        System.out.println("Can't pause, playback has no started yet.");
    }

    @Override
    public void stop() {
        System.out.println("I'm Already stopped");
    }
}
