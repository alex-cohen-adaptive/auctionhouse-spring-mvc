package com.example.financesimulatorspring;

public record GoldAsset(float weight) implements Asset {

    @Override
    public String name() {
        return "Gold Asset!";
    }

    @Override
    public double gains() {
        double pricePerOunce = 1893.92;
        return weight * pricePerOunce;
    }
}
