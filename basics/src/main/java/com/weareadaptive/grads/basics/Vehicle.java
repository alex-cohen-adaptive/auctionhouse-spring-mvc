package com.weareadaptive.grads.basics;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {


    private final AeroDynamicsPackage aeroDynamicsPackage;
    private final Engine engine;
    private final long fuelQuantity;

    public Vehicle(
            AeroDynamicsPackage aeroDynamicsPackage,
            Engine engine,
            long fuelQuantity) {

        this.aeroDynamicsPackage = aeroDynamicsPackage;
        this.engine = engine;
        this.fuelQuantity = fuelQuantity;
    }

    public long getMaxDistance() {
        return fuelQuantity = aeroDynamicsPackage.getDragFactor()
    }
}
