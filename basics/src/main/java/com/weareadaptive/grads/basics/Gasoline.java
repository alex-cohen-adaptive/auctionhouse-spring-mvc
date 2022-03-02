package com.weareadaptive.grads.basics;

public class Gasoline implements EnergySource {
    @Override
    public long energyDensity() {
        return 100;
    }

    @Override
    public String getName() {
        return null;
    }
}
