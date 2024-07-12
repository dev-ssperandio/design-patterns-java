package com.example.creational.abstractfactory;

public class MonsterFactory implements CharacterFactory{

    @Override
    public Character createCharacter() {
        return new Monster();
    }
}
