package com.cc.edpayments.paymentcollator.service;

import lombok.Data;
import model.Currency;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Data
@Service
public class CurrencyRate {

    private final Currency base = Currency.NGN;


    public Map<Currency, Double> getRates() {
        Map<Currency, Double> rates = new HashMap<>();
        rates.put(Currency.NGN, 1D);
        rates.put(Currency.USD, 0.0025);
        rates.put(Currency.EUR, 0.0021);
        return rates;
    }
}
