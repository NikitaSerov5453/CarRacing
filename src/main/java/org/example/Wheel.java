package org.example;

public class Wheel extends Part {
    public Wheel() {
        name = "ahiles";
        size = 14;
        friction = 1;
    }

    private String name;
    private int size;
    private int friction;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFriction() {
        return friction;
    }

    public void setFriction(int friction) {
        this.friction = friction;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "name='" + getName() + '\'' +
                ", size=" + getSize() +
                ", friction=" + getFriction() +
                '}' + '\n';
    }
}
