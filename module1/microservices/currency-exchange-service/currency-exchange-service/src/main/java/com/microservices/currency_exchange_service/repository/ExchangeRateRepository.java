//import org.springframework.data.jpa.repository.JpaRepository;

//
//public interface ExchangeRateRepository extends JpaRepository<CurrencyExchange, Long> {
//    CurrencyExchange findByFromAndTo(String from, String to);
//
//}

package com.microservices.currency_exchange_service.repository;
import com.microservices.currency_exchange_service.entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
 public interface ExchangeRateRepository extends JpaRepository<CurrencyExchange, Long> {

     CurrencyExchange findByFromAndTo(String from, String to);
 }

