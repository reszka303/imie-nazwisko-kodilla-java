package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        Logger.getInstance().Log("Operation finished");

        String lastLog = Logger.getInstance().getLastLog();

        Assert.assertEquals("Operation finished", lastLog);
    }
}
