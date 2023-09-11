package org.example;

public class Controller {
    public Controller() {

    }

    public static void start() {

    }

    public int carPower(Car car) {
        return ((100 - car.transmission.getDeterioration()) + car.engine.getPower() * car.wheel.getFriction()) / (car.body.getMass()/1000);
    }

    public void carComparison(Car car1, Car car2) {
        if (car1.equals(car2)) {
            System.out.println(car1 + "\n" + "Победил!");
        } else {
            System.out.println(car2 + "\n" + "Победил!");
        }
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

    public Transmission createTransmissionTTI() {
        Transmission transmission = new Transmission();
        transmission.setName("TTI");
        transmission.setDeterioration(0);
        transmission.setCost(2_000_000);
        return transmission;
    }
    public Transmission createTransmissionSamsonas() {
        Transmission transmission = new Transmission();
        transmission.setName("Samsonas");
        transmission.setDeterioration(0);
        transmission.setCost(1_500_000);
        return transmission;
    }
    public Transmission createTransmissionDeafult() {
        Transmission transmission = new Transmission();
        transmission.setName("default");
        transmission.setDeterioration(90);
        transmission.setCost(6_000);
        return transmission;
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
}
