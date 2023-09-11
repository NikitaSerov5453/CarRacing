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
        Controller controller = new Controller();
        System.out.println("Выберете кузов");
        System.out.println("1. Lada Priora");
        System.out.println("2. Toyota Supra");
        System.out.println("3. Nissan GTR 35");
        switch (scanner.nextInt()) {
            case 1:
                body = controller.createBodyLadaPriora();
                break;
            case 2:
                body = controller.createBodyToyotaSupra();
                break;
            case 3:
                body = controller.createBodyNissanGTR35();
                break;
            default:
                System.out.println("Ошибка");
        }
        System.out.println("Выберете двигатель");
        System.out.println("1. 2JZ");
        System.out.println("2. VR38DET");
        System.out.println("3. 3110(");
        switch (scanner.nextInt()) {
            case 1:
                engine = controller.createEngine2JZ();
                break;
            case 2:
                engine = controller.createEngineVR38DET();
                break;
            case 3:
                engine = controller.createEngine3110();
                break;
            default:
                System.out.println("Ошибка");
        }
        System.out.println("Выберете КПП");
        System.out.println("1. TTI");
        System.out.println("2. Samsonas");
        System.out.println("3. default");
        switch (scanner.nextInt()) {
            case 1:
                transmission = controller.createTransmissionTTI();
                break;
            case 2:
                transmission = controller.createTransmissionSamsonas();
                break;
            case 3:
                transmission = controller.createTransmissionDeafult();
                break;
            default:
                System.out.println("Ошибка");
        }
        System.out.println("Выберете колеса");
        System.out.println("1. Ahiles");
        System.out.println("2. Westlake");
        System.out.println("3. Valina");
        switch (scanner.nextInt()) {
            case 1:
                wheel = controller.createWheelAhiles();
                break;
            case 2:
                wheel = controller.createWheelWestlake();
                break;
            case 3:
                wheel = controller.createWheelValina();
                break;
            default:
                System.out.println("Ошибка");
        }
    }

    @Override
    public String toString() {
        return "Car{ \n" + body + transmission + wheel + engine + '}' + '\n';
    }

    public Scanner scanner = new Scanner(System.in);
}
