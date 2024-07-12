package com.example.creational.abstractfactory;

public class HeroFactory implements CharacterFactory {

    @Override
    public Character createCharacter() {
        return new Hero();
    }
}
