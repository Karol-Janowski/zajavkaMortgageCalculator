package pl.zajavka.mortgage.model;

import lombok.AccessLevel;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Overpayment {

    @Getter(AccessLevel.NONE)
    public static final String REDUCE_RATE = "REDUCE_RATE";
    @Getter(AccessLevel.NONE)
    public static final String REDUCE_PERIOD = "REDUCE_PERIOD";


    private final BigDecimal amount;


    private final BigDecimal provisionAmount;

    public Overpayment(final BigDecimal amount, final BigDecimal provisionAmount) {
        this.amount = amount;
        this.provisionAmount = provisionAmount;
    }

}
