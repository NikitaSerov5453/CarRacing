package org.example;

public class Engine extends Part {
    public Engine() {
        name = "3110";
        power = 100;
    }

    private int power;
    private String name;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine{" + "power=" + getPower() + ", name='" + getName() + '\'' + '}' + '\n';
    }
}
