package org.example;

public class FourXFour extends Car{

    private Boolean fourWheelDrive;

    public FourXFour(String model, int year, String color, String brand, Boolean fourWheelDrive) {
        super(model, year, color, brand);
        this.fourWheelDrive = fourWheelDrive;
    }

    public void fourWheelDrive(){
        System.out.println("The car is four wheel drive");
    }

    public Boolean getFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(Boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }
}
