package org.example;

public class Controller {
    public Controller() {

    }

    public static void start() {

    }

    public void carComparison(CreateCar car1, CreateCar car2) {
        if (car1.carPower() > car2.carPower()) {
            System.out.println(car1 + "\n" + "Победил!");
        } else {
            System.out.println(car2 + "\n" + "Победил!");
        }
    }
}
