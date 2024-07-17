package com.example.behavioral.state;

public class PausedState implements PlaybackState{
    @Override
    public void play() {
        System.out.println("Resuming playback.");
    }

    @Override
    public void pause() {
        System.out.println("I'm already paused.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping playback.");
    }
}
