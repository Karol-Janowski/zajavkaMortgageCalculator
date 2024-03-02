package pl.zajavka.mortgage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
@Getter
@AllArgsConstructor

public class MortgageReference {

    private final BigDecimal referenceAmount;

    private final BigDecimal referenceDuration;

}
