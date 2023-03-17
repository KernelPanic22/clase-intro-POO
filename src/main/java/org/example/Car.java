package org.example;

public class Car {
    //VARIBALES sus CARACTERISTICAS / propiedades
    private String model;
    private int year;
    private String color;
    private String brand;

    public Car(String model, int year, String color, String brand) {
        this.brand= brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    protected void turnOn(){
        System.out.println("The car is on");
    }

    protected void turnOff(){
        System.out.println("The car is off");
    }

    public void accelerate(){
        System.out.println("The car is accelerating");
    }

    protected void brake(){
        System.out.println("The car is braking");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Brand: "+ brand + ", Model: " + model + ", Year: " + year + ", Color: " + color;
    }


}
