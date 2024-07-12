package com.example.creational.factorymethod;

public class FactoryMethodExample {

    public static void main(String[] args) {
        EnemyFactory factory = new EnemyFactory();

        Enemy enemy1 = factory.enemyCreate("weak");
        enemy1.attack();

        Enemy enemy2 = factory.enemyCreate("strong");
        enemy2.attack();
    }
}