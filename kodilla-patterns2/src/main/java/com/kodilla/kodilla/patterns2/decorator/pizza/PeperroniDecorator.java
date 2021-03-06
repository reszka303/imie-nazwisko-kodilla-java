package com.kodilla.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PeperroniDecorator extends AbstractPizzaOrderDecorator {
    public PeperroniDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", peperroni";
    }
}
