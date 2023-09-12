package org.example;

public class Transmission extends Part {
    private int deterioration;

    public Transmission() {
        name = "default";
        deterioration = 90;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getDeterioration() {
        return deterioration;
    }

    public void setDeterioration(int deterioration) {
        this.deterioration = deterioration;
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

    @Override
    public String toString() {
        return "Transmission{" +
                "name='" + getName() + '\'' +
                ", deterioration=" + getDeterioration() +
                '}' + '\n';
    }
}
