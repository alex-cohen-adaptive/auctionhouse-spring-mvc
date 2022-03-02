package com.weareadaptive.grads.basics;

import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class VehicleSimulator {
    private static final Logger LOGGER = LoggerFactory.getLogger(VehicleSimulator.class);
    public VehicleSimulator(Vehicle toSimulate) {

    }
}
