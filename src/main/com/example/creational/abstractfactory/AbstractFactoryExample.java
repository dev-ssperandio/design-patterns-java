package com.example.creational.abstractfactory;

public class AbstractFactoryExample {

    public static void main(String[] args) {
        CharacterFactory heroFactory = new HeroFactory();
        Character hero = heroFactory.createCharacter();
        hero.takeAction();

        CharacterFactory monsterFactory = new MonsterFactory();
        Character monster = monsterFactory.createCharacter();
        monster.takeAction();
    }
}
