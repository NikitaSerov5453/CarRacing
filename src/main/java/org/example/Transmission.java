package org.example;

public class Transmission extends Part {
    public Transmission() {
        name = "default";
        deterioration = 90;
    }

    private String name;
    private int deterioration;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getDeterioration() {
        return deterioration;
    }

    public void setDeterioration(int deterioration) {
        this.deterioration = deterioration;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "name='" + getName() + '\'' +
                ", deterioration=" + getDeterioration() +
                '}' + '\n';
    }
}
