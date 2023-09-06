package org.example;

public class Body extends Part {
    public Body() {
        name = "Priora";
        mass = 1066;
    }

    private String name;
    private int mass;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Body{" +
                "name='" + getName() + '\'' +
                ", mass=" + getMass() +
                '}' + '\n';
    }
}
