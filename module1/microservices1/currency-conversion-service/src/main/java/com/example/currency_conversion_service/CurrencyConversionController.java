package com.example.currency_conversion_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {
    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversion(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable BigDecimal quantity) {

        // For simplicity, let's assume a conversion rate and environment
        BigDecimal conversionMultiple = new BigDecimal("74.35"); // Example conversion rate (USD to INR)
        BigDecimal totalCalculatedAmount = conversionMultiple.multiply(quantity);
        String environment = "currency-conversion-service"; // You can dynamically set this if needed

        // Create and return the CurrencyConversion object
        return new CurrencyConversion(1001L, from, to, conversionMultiple, quantity, totalCalculatedAmount, environment);
    }

}
