package org.example;

abstract public class Part {

    public Part() {

    }

    private int cost;
    private String name;

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Part{" + "cost=" + cost + ", name='" + name + '\'' + '}';
    }
}
