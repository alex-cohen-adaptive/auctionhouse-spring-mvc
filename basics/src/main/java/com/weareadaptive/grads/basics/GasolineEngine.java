package com.weareadaptive.grads.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GasolineEngine implements Engine{


    private final EnergySource gasoline;

    public GasolineEngine(EnergySource gasoline) {
        this.gasoline = gasoline;
    }

    public GasolineEngine() {
        this.gasoline =  getFuel();

    }

    @Override
    public EnergySource getFuel() {
        return null;
    }

    @Override
    public String name() {
        return null;
    }
}
