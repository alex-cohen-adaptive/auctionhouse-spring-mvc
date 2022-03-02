package com.example.financesimulatorspring;

public record TaxLiability(double profits) implements Liability{
    @Override
    public double loss() {
        return 0.30 * profits;
    }

    @Override
    public String name() {
        return "Tax Liability";
    }
}
