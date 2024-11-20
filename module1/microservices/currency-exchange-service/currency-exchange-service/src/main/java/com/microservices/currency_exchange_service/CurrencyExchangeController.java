package com.microservices.currency_exchange_service;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @GetMapping("currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
        BigDecimal conversionMultiple = new BigDecimal("65.00");
        CurrencyExchange exchange = new CurrencyExchange(1000L, from, to, conversionMultiple);
        String port = environment.getProperty("local.server.port");
        exchange.setEnvironment(port);
        return exchange;
    }
}
