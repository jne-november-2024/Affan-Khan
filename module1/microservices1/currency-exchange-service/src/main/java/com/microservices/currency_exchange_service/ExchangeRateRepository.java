package com.microservices.currency_exchange_service.repository;
import com.microservices.currency_exchange_service.entity.CurrencyExchange;

import org.springframework.stereotype.Repository;


import com.microservices.currency_exchange_service.entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from, String to);
}
