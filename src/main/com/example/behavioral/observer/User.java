package com.example.behavioral.observer;

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println(name + " received notification: " + message);
    }
}
