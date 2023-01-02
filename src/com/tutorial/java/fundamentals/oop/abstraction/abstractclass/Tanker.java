package com.tutorial.java.fundamentals.oop.abstraction.abstractclass;

public class Tanker extends LongVehicle{
    int volumeOfTank;
    @Override
    void toggleFloodLight() {
        if (isFloodLightOn) {
            isFloodLightOn = false;
        }else {
            isFloodLightOn = true;
        }
    }

    @Override
    void applyBreak(int breakPoint) {
        speed -= (breakPoint * 1.4);
    }

    public Tanker(int volumeOfTank) {
        this.volumeOfTank = volumeOfTank;
    }

    @Override
    String displayMessage() {
        String displayMessage = super.displayMessage();
        return displayMessage + " volumeOfTank : " + volumeOfTank;
    }
}
