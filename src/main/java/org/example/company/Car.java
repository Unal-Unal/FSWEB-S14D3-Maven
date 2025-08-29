package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = Boolean.TRUE;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public Car() {
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        printSimpleName();
        return "the car's engine is starting";
    }

    public String accelerate(){
        printSimpleName();
        return "the car is accelerating";
    }

    public String brake(){
        printSimpleName();
        return "the car is braking";
    }

    private void printSimpleName(){
        System.out.println("Class name: " + getClass().getSimpleName());
    }






    @Override

    public boolean equals(Object object){
        if (this == object) return true; // Aynı referanssa eşittir
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
