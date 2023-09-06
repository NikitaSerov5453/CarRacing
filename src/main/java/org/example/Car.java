package org.example;

import java.util.Scanner;

public class Car {
    Body body = new Body();
    Transmission transmission = new Transmission();
    Wheel wheel = new Wheel();
    Engine engine = new Engine();

    public Car() {

    }

    public void createCar() {
        Body body = new Body();
        Transmission transmission = new Transmission();
        Wheel wheel = new Wheel();
        Engine engine = new Engine();

        System.out.println("Введите массу авто");
        body.setMass(scanner.nextInt());
        System.out.println("Введите название кузова");
        body.setName(scanner.nextLine());
        body.setCost(0);
        engine.setName(scanner.nextLine());
        engine.setPower(scanner.nextInt());
        engine.setCost(0);
    }

    @Override
    public String toString() {
        return "Car{ \n" + body + transmission + wheel + engine + '}' + '\n';
    }

    public Scanner scanner = new Scanner(System.in);
}
