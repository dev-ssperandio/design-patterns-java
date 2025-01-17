package com.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component{
    private String name;
    private List<Component> components;

    public Folder(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void print() {
        System.out.println("Folder: " + name);
        for (Component component : components) {
            component.print();
        }
    }
}
