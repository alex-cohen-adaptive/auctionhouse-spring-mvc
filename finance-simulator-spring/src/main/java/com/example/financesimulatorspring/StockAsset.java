package com.example.financesimulatorspring;

public record StockAsset(int quantity) implements Asset{
    @Override
    public String name() {
        return "Stock Liability";
    }

    @Override
    public double gains() {
        double stockPrice = 200;
        return quantity*stockPrice;
    }
}
