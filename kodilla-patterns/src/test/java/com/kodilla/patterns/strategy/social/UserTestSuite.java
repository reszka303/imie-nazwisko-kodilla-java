package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        User millenials = new Millenials("Steven");
        User yGeneration = new YGeneration("John");
        User zGeneration = new ZGeneration("Laura");

        String stevenShouldShare = millenials.sharePost();
        System.out.println("Steven share: " + stevenShouldShare);
        String johnShouldShare = yGeneration.sharePost();
        System.out.println("John share: " + johnShouldShare);
        String lauraShouldShare = zGeneration.sharePost();
        System.out.println("Laura share: " + lauraShouldShare);

        Assert.assertEquals("Twitter", stevenShouldShare);
        Assert.assertEquals("Facebook", johnShouldShare);
        Assert.assertEquals("Snapchat", lauraShouldShare);
        System.out.println();
    }

    @Test
    public void testIndividualSharingStrategy() {
        User millenials = new Millenials("Steven");

        String stevenShouldShare = millenials.sharePost();
        System.out.println("Steven share: " + stevenShouldShare);
        millenials.setSocialPublisher(new FacebookPublisher());
        stevenShouldShare = millenials.sharePost();
        System.out.println("Steven share now: " + stevenShouldShare);

        Assert.assertEquals("Facebook", stevenShouldShare);
    }
}
