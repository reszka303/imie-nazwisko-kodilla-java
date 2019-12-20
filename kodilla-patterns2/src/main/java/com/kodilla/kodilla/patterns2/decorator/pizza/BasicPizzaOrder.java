package com.kodilla.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(10.00);
    }

    @Override
    public String getDescription() {
        return "Pie is ready, adding toppings: base";
    }
}
