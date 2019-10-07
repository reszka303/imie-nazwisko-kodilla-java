package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Onion")
                .bun("with Sesame")
                .burgers(3)
                .sauce("Barbecue")
                .ingredient("Mushrooms")
                .build();
        System.out.println(bigmac);

        int howManyIngredients = bigmac.getIngredients().size();
        String withSesameOrNot = bigmac.getBun();

        Assert.assertEquals(2, howManyIngredients);
        Assert.assertEquals("with Sesame", withSesameOrNot);
    }
}
