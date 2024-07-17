package com.example.structural.adapter;

public class AdapterExample {

    public static void main(String[] args) {
        AudioPlayerMP3 audioPlayerMP3 = new AudioPlayerMP3();
        AudioPlayer playerMP3 = new AudioPlayerMP3Adapter(audioPlayerMP3);
        playerMP3.processAudio("audio.mp3");

        AudioPlayerWAV audioPlayerWAV = new AudioPlayerWAV();
        AudioPlayer playerWAV = new AudioPlayerWAVAdapter(audioPlayerWAV);
        playerWAV.processAudio("audio.wav");
    }
}
