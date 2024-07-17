package com.example.behavioral.state;

public class StateExample {

    public static void main(String[] args) {
        PlaybackState playingState = new PlayingState();
        PlaybackState pausedState = new PausedState();
        PlaybackState stoppedState = new StoppedState();

        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setState(stoppedState);

        mediaPlayer.play();
        mediaPlayer.pause();
        mediaPlayer.stop();
    }
}
