package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {

        int numbers[] = new int[20];
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 2;
        numbers[3] = 4;
        numbers[4] = 2;
        numbers[5] = 4;
        numbers[6] = 2;
        numbers[7] = 4;
        numbers[8] = 2;
        numbers[9] = 4;
        numbers[10] = 2;
        numbers[11] = 4;
        numbers[12] = 2;
        numbers[13] = 4;
        numbers[14] = 2;
        numbers[15] = 4;
        numbers[16] = 2;
        numbers[17] = 4;
        numbers[18] = 2;
        numbers[19] = 4;

        double average = ArrayOperations.getAverage(numbers);


        Assert.assertEquals(20, numbers.length);
        Assert.assertEquals(3.0, average, 0.001);
    }
}
