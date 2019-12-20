package com.kodilla.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class EndPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public EndPizzaOrderDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(0));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", and your order is ready!";
    }
}
