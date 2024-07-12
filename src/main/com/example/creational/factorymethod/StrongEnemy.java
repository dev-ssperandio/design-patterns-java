package com.example.creational.factorymethod;

public class StrongEnemy implements Enemy {

    @Override
    public void attack() {
        System.out.println("Weak enemy attacking in a powerful manner!");
    }
}