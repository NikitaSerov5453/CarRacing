package org.example;

public class Main {
    public static void main(String[] args) {
        CreateCar createCar = new CreateCar();
        CreateCar createCar1 = new CreateCar();
        Controller controller = new Controller();
        createCar.createCar();
        System.out.println(createCar);
        createCar1.createCar();
        System.out.println(createCar1);
        controller.carComparison(createCar, createCar1);
    }
}