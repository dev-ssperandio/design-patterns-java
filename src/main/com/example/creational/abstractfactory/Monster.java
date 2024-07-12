package com.example.creational.abstractfactory;

public class Monster implements Character{
    @Override
    public void takeAction() {
        System.out.println("Monster performing scary action!");
    }
}
