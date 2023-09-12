package org.example;

import java.util.Scanner;

public class Car {
    Body body = new Body();
    Transmission transmission = new Transmission();
    Wheel wheel = new Wheel();
    Engine engine = new Engine();

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{ \n" + body + transmission + wheel + engine + '}' + '\n';
    }
}
