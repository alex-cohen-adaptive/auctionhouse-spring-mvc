package com.weareadaptive.grads.basics;

import org.springframework.stereotype.Component;

@Component
public class TractorAerodynamics {
    @Override
    public long getDragFactor() {
        return 10;
    }
}
