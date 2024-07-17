package com.example.behavioral.observer;

public class ObserverExample {

    public static void main(String[] args) {
        Messenger messenger = new Messenger();

        User user1 = new User("Sidney");
        User user2 = new User("Ivanessa");

        messenger.addObserver(user1);
        messenger.addObserver(user2);

        messenger.receiveMessage("Hello! new message!");

        messenger.removeObserver(user1);

        messenger.receiveMessage("An important message!");
    }
}
