package org.example;

public class SportCar extends Car{

    private int horsePower;
    private int torque;

    public SportCar(String model, int year, String color, String brand, int horsePower, int torque) {
        super(model, year, color, brand);
        this.horsePower = horsePower;
        this.torque = torque;
    }

    public void turbo(){
        System.out.println("The car is turbo");
    }

    public void race(){
        System.out.println("The car is racing");
    }

    public void nitro(){
        System.out.println("The car is nitro");
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }
}
