package com.example.financesimulatorspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public record Business(@Qualifier("getStockAsset") Asset asset,
                       @Qualifier("tax") Liability liability) {

    public double getNetProfits() {
        return asset.gains() - liability.loss();
    }


}
