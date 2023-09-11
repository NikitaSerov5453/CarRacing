package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();
        Controller controller = new Controller();
        car.createCar();
        System.out.println(car);
        car1.createCar();
        System.out.println(car1);
        controller.carComparison(car, car1);

    }
}