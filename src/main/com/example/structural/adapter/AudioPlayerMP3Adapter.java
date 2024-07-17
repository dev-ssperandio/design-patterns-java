package com.example.structural.adapter;

public class AudioPlayerMP3Adapter implements AudioPlayer {
    private AudioPlayerMP3 audioPlayerMP3;

    public AudioPlayerMP3Adapter(AudioPlayerMP3 audioPlayerMP3) {
        this.audioPlayerMP3 = audioPlayerMP3;
    }

    @Override
    public void processAudio(String audio) {
        audioPlayerMP3.playAudio(audio);
    }
}
