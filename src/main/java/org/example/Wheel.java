package org.example;

public class Wheel extends Part {
    private int size;
    private int friction;

    public Wheel() {
        name = "ahiles";
        size = 14;
        friction = 1;
    }


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

    public Wheel createWheelAhiles() {
        Wheel wheel = new Wheel();
        wheel.setName("Ahiles");
        wheel.setSize(14);
        wheel.setFriction(1);
        wheel.setCost(80_000);
        return wheel;
    }
    public Wheel createWheelWestlake() {
        Wheel wheel = new Wheel();
        wheel.setName("Westlake");
        wheel.setSize(18);
        wheel.setFriction(2);
        wheel.setCost(120_000);
        return wheel;
    }
    public Wheel createWheelValina() {
        Wheel wheel = new Wheel();
        wheel.setName("Valina(");
        wheel.setSize(18);
        wheel.setFriction(3);
        wheel.setCost(250_000);
        return wheel;
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
