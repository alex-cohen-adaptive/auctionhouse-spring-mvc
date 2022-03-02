package com.example.financesimulatorspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BusinessSimulator {
    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessSimulator.class);
    public BusinessSimulator(Business business) {
        LOGGER.info("the business has made ${} and lost ${}, its net profit is ${} ",
                business.asset().gains(), business.liability().loss(),business.getNetProfits());

    }
}
