package org.example.company;

public class Ford extends Car{
    public Ford(Integer cylinders, String name) {
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
