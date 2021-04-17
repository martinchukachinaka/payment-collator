package model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@Builder
public class Payment implements Serializable {

    private String id;

    private String payerEmail;

    private Double amount;

    private String recipientEmail;

    private LocalDateTime paymentDate;

    private Currency currencyCode;

    private Double appliedAmount;

    private Currency appliedCurrency;

    private Double appliedRate;

}
