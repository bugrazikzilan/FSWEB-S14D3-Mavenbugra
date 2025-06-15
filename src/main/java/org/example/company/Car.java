package org.example.company;

import java.util.Objects;

public class Car {
    private Boolean engine;
    private Integer cylinders;
    private String name;
    private Integer wheels;

    public Car(Integer cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }


    public String startEngine(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "the car is braking";
    }

    public Integer getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(cylinders, car.cylinders) && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
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




