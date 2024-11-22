package com.microservices.currency_exchange_service;

import com.microservices.currency_exchange_service.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<CurrencyExchange, Long> {
    // Custom query methods can go here
    CurrencyExchange findByFromAndTo(String from, String to);
}
