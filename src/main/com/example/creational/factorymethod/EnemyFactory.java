package com.example.creational.factorymethod;

public class EnemyFactory {

    public Enemy enemyCreate(String type) {
        if (type.equals("weak")) {
            return new WeakEnemy();
        } else if (type.equals("strong")) {
            return new StrongEnemy();
        } else {
            throw new IllegalArgumentException("Invalid enemy type");
        }
    }
}