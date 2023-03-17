package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCar() {
        Car audiA4 = new Car("A4", 2010, "Black", "Audi");
        Car porsche911 = new Car("911", 2015, "Red", "Porsche");
        assertEquals("Audi", audiA4.getBrand());
        assertEquals("A4", audiA4.getModel());
        assertEquals(2010, audiA4.getYear());
        assertEquals("Black", audiA4.getColor());


        audiA4.setModel("A5");
        audiA4.getModel();

        assertEquals("Porsche", porsche911.getBrand());
        assertEquals("911", porsche911.getModel());
        assertEquals(2015, porsche911.getYear());
        assertEquals("Red", porsche911.getColor());

        SportCar ferrari = new SportCar("Ferrari", 2019, "Red", "Ferrari", 500, 500);

        ferrari.getHorsePower();
        ferrari.getTorque();
        ferrari.accelerate();
        ferrari.brake();
        ferrari.turnOn();
        ferrari.turnOff();
        ferrari.turbo();
        ferrari.nitro();

        FourXFour sandero = new FourXFour("Sandero", 2019, "Red", "Renault", true);

        sandero.getFourWheelDrive();
        sandero.accelerate();
        sandero.brake();
        sandero.turnOn();
        sandero.turnOff();
        sandero.fourWheelDrive();

    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Car car = new Car("Audi", 2010, "Black", "A4");
        assertEquals("Brand: Audi, Model: A4, Year: 2010, Color: Black", car.toString());
    }
}
