package org.example;

public class Body extends Part {
    private int mass;

    public Body() {
        name = "Priora";
        mass = 1066;
    }

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

    public Body createBodyToyotaSupra() {
        Body body = new Body();
        body.setName("Toyota Supra");
        body.setMass(1600);
        body.setCost(3_000_000);
        return body;
    }
    public Body createBodyLadaPriora() {
        Body body = new Body();
        body.setName("Lada Priora");
        body.setMass(1066);
        body.setCost(600_000);
        return body;
    }

    public Body createBodyNissanGTR35() {
        Body body = new Body();
        body.setName("Nissan GTR 35");
        body.setMass(1800);
        body.setCost(5_000_000);
        return body;
    }

    @Override
    public String toString() {
        return "Body{" +
                "name='" + getName() + '\'' +
                ", mass=" + getMass() +
                '}' + '\n';
    }
}
