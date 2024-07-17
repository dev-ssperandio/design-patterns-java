package com.example.structural.adapter;

public class AudioPlayerWAVAdapter implements AudioPlayer{
    private AudioPlayerWAV audioPlayerWAV;

    public AudioPlayerWAVAdapter(AudioPlayerWAV audioPlayerWAV) {
        this.audioPlayerWAV = audioPlayerWAV;
    }

    @Override
    public void processAudio(String audio) {
        audioPlayerWAV.playAudio(audio);
    }
}
