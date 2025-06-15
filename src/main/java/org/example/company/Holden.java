package org.example.company;

public class Holden extends Car{
    public Holden(Integer cylinders, String name) {
        super(cylinders, name);
    }


    public String startEngine() {
        return getName() + " started engine.";
    }

    @Override
    public String accelerate() {
        return getName() + " is accelerating.";
    }

    @Override
    public String brake() {
        return getName() + " is braking.";
    }
}
