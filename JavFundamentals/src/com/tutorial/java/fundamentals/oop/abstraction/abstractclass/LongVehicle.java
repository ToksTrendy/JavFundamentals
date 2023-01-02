package com.tutorial.java.fundamentals.oop.abstraction.abstractclass;

public abstract class LongVehicle extends Vehicle{
    boolean isFloodLightOn;
    abstract void toggleFloodLight();

    String displayMessage() {
        String superDisplayMessage = super.displayMessage();
        return superDisplayMessage + " isFloodLightOn : " + isFloodLightOn;
    }
}
