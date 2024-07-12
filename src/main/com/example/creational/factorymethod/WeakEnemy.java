package com.example.creational.factorymethod;

public class WeakEnemy implements Enemy {

    @Override
    public void attack() {
        System.out.println("Weak enemy attacking in a simple manner.");
    }
}