package com.cc.edpayments.paymentcollator;

import com.cc.edpayments.paymentcollator.service.CurrencyConverter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Map;
import java.util.function.Function;


@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class PaymentCollatorApplication {

    private final CurrencyConverter converter;


    public static void main(String[] args) {
        SpringApplication.run(PaymentCollatorApplication.class, args);
    }


    @Bean
    public Function<Map<String, Object>, Map<String, Object>> convertToBaseCurrency() {
        return payload -> {
            log.info("processing {}", payload);
            converter.applyBaseCurrency(payload);
            return payload;
        };
    }

}
