package com.cc.edpayments.paymentcollator.service;

import lombok.RequiredArgsConstructor;
import model.Currency;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
@RequiredArgsConstructor
public class CurrencyConverter {

    private final CurrencyRate currencyRate;


    public void applyBaseCurrency(Map<String, Object> payload) {
        Double rate = currencyRate.getRates().get(Currency.valueOf((String) payload.get("currencyCode")));
        //        payload.setAppliedRate(rate);
        //        payload.setAppliedAmount(payload.getAmount() / rate);
        //        payload.setAppliedCurrency(currencyRate.getBase());
        payload.put("appliedRate", rate);
        payload.put("appliedAmount", ((Double) payload.get("amount")) / rate);
        payload.put("appliedCurrency", currencyRate.getBase());
    }
}
