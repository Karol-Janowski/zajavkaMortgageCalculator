package pl.zajavka.mortgage.model;

import lombok.Getter;

import java.math.BigDecimal;

public class Overpayment {

    public static final String REDUCE_RATE = "REDUCE_RATE";

    public static final String REDUCE_PERIOD = "REDUCE_PERIOD";

    @Getter
    private final BigDecimal amount;

    @Getter
    private final BigDecimal provisionAmount;

    public Overpayment(final BigDecimal amount, final BigDecimal provisionAmount) {
        this.amount = amount;
        this.provisionAmount = provisionAmount;
    }

}
