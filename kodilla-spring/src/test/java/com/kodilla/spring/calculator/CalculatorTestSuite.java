package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        Double valAdd = calculator.add(2,2);
        Double valSub = calculator.sub(10, 5);
        Double valMul = calculator.mul(4,4);
        Double valDiv = calculator.div(10,5);

        Assert.assertEquals(4, valAdd, 0.1);
        Assert.assertEquals(5, valSub,0.1);
        Assert.assertEquals(16, valMul, 0.1);
        Assert.assertEquals(2, valDiv, 0.1);

    }
}
