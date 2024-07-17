package com.example.behavioral.state;

public class MediaPlayer {
    private PlaybackState currentState;

    public MediaPlayer() {
        this.currentState = new StoppedState();
    }

    public void setState(PlaybackState state) {
        this.currentState = state;
    }

    public void play() {
        currentState.play();
    }

    public void pause() {
        currentState.pause();
    }

    public void stop() {
        currentState.stop();
    }
}
