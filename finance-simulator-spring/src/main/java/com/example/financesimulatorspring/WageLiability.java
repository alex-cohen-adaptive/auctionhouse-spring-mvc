package com.example.financesimulatorspring;

public class WageLiability implements Liability{
    @Override
    public double loss() {
        return 100000.0;
    }

    @Override
    public String name() {
        return "Wage Liability";
    }
}
