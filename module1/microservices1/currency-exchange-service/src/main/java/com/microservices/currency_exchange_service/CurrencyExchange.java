package com.microservices.currency_exchange_service.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
public class CurrencyExchange {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "currency_from")
    private String from;

    @Column(name = "currency_to")
    private String to;

    // Change conversionMultiple to BigDecimal to be consistent with the constructor
    private BigDecimal conversionMultiple;

    private String environment;

    // Constructor with BigDecimal for conversionMultiple
    public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    // Constructor without id, conversionMultiple as BigDecimal
    public CurrencyExchange(String from, String to, BigDecimal conversionMultiple) {
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    // Default constructor
    public CurrencyExchange() {}

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    // Change getter to return BigDecimal
    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    // Change setter to accept BigDecimal
    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public String toString() {
        return "CurrencyExchange{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", conversionMultiple=" + conversionMultiple +
                ", environment='" + environment + '\'' +
                '}';
    }
}
