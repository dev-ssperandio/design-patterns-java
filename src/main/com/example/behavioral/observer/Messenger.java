package com.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Messenger implements Subject{
    private List<Observer> observers;

    public Messenger() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer observer : observers) {
            observer.receiveNotification(message);
        }
    }

    public void receiveMessage(String message) {
        System.out.println("New message received: " + message);
        notifyObserver(message);
    }
}
