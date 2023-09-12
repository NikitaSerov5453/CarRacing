package org.example;

import java.util.Scanner;

public class CreateCar extends Car{
    Car car = new Car();
    public Scanner scanner =  new Scanner(System.in);

    public CreateCar() {

    }

    public void createCar() {
        System.out.println("Выберете кузов\n" + "1. Lada Priora\n" + "2. Toyota Supra\n" + "3. Nissan GTR 35");
        switch (scanner.nextInt()) {
            case 1:
                car.body = car.body.createBodyLadaPriora();
                break;
            case 2:
                car.body = car.body.createBodyToyotaSupra();
                break;
            case 3:
                car.body = car.body.createBodyNissanGTR35();
                break;
            default:
                System.out.println("Ошибка");
        }

        System.out.println("Выберете \n" + "1. 2JZ\n" + "2. VR38DET\n" + "3. 3110");
        switch (scanner.nextInt()) {
            case 1:
                car.engine = car.engine.createEngine2JZ();
                break;
            case 2:
                car.engine = car.engine.createEngineVR38DET();
                break;
            case 3:
                car.engine = car.engine.createEngine3110();
                break;
            default:
                System.out.println("Ошибка");
        }

        System.out.println("Выберете КПП\n" + "1. TTI\n" + "2. Samsonas\n" + "3. default");
        switch (scanner.nextInt()) {
            case 1:
                car.transmission = car.transmission.createTransmissionTTI();
                break;
            case 2:
                car.transmission = car.transmission.createTransmissionSamsonas();
                break;
            case 3:
                car.transmission = car.transmission.createTransmissionDeafult();
                break;
            default:
                System.out.println("Ошибка");
        }

        System.out.println("Выберете колеса\n" + "1. Ahiles\n" + "2. Westlake\n" + "3. Valina");
        switch (scanner.nextInt()) {
            case 1:
                car.wheel = car.wheel.createWheelAhiles();
                break;
            case 2:
                car.wheel = car.wheel.createWheelWestlake();
                break;
            case 3:
                car.wheel = car.wheel.createWheelValina();
                break;
            default:
                System.out.println("Ошибка");
        }

    }

    public int carPower() {
        int carPower;
        return carPower = ((100 - car.transmission.getDeterioration()) * car.engine.getPower() * car.wheel.getFriction()) * (car.body.getMass());
    }

    @Override
    public String toString() {
        return "Car{ \n" + car.body + car.engine + car.transmission + car.wheel + '}' + '\n';
    }
}
