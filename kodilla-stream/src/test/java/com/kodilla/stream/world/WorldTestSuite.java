package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        Country poland = new Country("Poland", new BigDecimal("38413000"));
        Country germany = new Country("Germany", new BigDecimal("83019200"));
        Country luxembourg = new Country("Luxembourg", new BigDecimal("602005"));
        Country usa = new Country("USA", new BigDecimal("326079000"));
        Country canada = new Country("Canada", new BigDecimal("36708083"));
        Country mexico = new Country("Mexico", new BigDecimal("124574795"));
        Country japan = new Country("Japan", new BigDecimal("125878370"));
        Country southKorea = new Country("South Korea", new BigDecimal("51454000"));
        Country singapore = new Country("Singapore", new BigDecimal("5607300"));


        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(poland);
        europeCountries.add(germany);
        europeCountries.add(luxembourg);

        List<Country> northAmericaCountries = new ArrayList<>();
        northAmericaCountries.add(usa);
        northAmericaCountries.add(canada);
        northAmericaCountries.add(mexico);

        List<Country> asiaCountries = new ArrayList<>();
        asiaCountries.add(japan);
        asiaCountries.add(southKorea);
        asiaCountries.add(singapore);

        Continent europe = new Continent("Europe", europeCountries);
        Continent northAmerica = new Continent("North America", northAmericaCountries);
        Continent asia = new Continent("Asia", asiaCountries);

        List<Continent> allContinents = new ArrayList<>();
        allContinents.add(europe);
        allContinents.add(northAmerica);
        allContinents.add(asia);

        World world = new World(allContinents);


        Assert.assertEquals(new BigDecimal("38413000"), poland.getPeopleQuantity());
        Assert.assertEquals(new BigDecimal("122034205"), europe.getPeopleQuantity());
        Assert.assertEquals(new BigDecimal("487361878"), northAmerica.getPeopleQuantity());
        Assert.assertEquals(new BigDecimal("182939670"), asia.getPeopleQuantity());
        Assert.assertEquals(new BigDecimal("792335753"), world.getPeopleQuantity());

    }
}
