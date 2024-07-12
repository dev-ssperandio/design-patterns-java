package com.example.creational.abstractfactory;

public class Hero implements Character{

    @Override
    public void takeAction() {
        System.out.println("Hero performing special action!");
    }
}
