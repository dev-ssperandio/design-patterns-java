package com.example.behavioral.state;

public class PlayingState implements PlaybackState{
    @Override
    public void play() {
        System.out.println("I'm already playing.");
    }

    @Override
    public void pause() {
        System.out.println("Pausing playback.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping playback.");
    }
}
