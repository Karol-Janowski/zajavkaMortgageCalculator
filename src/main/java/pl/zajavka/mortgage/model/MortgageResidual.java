package pl.zajavka.mortgage.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Getter
@RequiredArgsConstructor
public class MortgageResidual {

    private final BigDecimal residualAmount;

    private final BigDecimal residualDuration;

    
}
