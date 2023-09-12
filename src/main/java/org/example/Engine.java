package org.example;

public class Engine extends Part {
    public Engine() {
        name = "3110";
        power = 100;
    }

    private int power;

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

    public Engine createEngine2JZ() {
        Engine engine = new Engine();
        engine.setName("2jz gte");
        engine.setPower(400);
        engine.setCost(600_000);
        return engine;
    }

    public Engine createEngineVR38DET() {
        Engine engine = new Engine();
        engine.setName("VR38DET");
        engine.setPower(600);
        engine.setCost(3_000_000);
        return engine;
    }

    public Engine createEngine3110() {
        Engine engine = new Engine();
        engine.setName("3110");
        engine.setPower(100);
        engine.setCost(20_000);
        return engine;
    }

    @Override
    public String toString() {
        return "Engine{" + "name='" + getName() + ", power=" + getPower() + '\'' + '}' + '\n';
    }
}
