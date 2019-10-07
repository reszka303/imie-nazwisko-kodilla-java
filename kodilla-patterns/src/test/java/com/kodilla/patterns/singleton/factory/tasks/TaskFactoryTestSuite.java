package com.kodilla.patterns.singleton.factory.tasks;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        TaskFactory factory = new TaskFactory();

        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shopping.executeTask();

        Assert.assertEquals(true, shopping.isTaskExecuted());
        Assert.assertEquals("Bakery", shopping.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        TaskFactory factory = new TaskFactory();

        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);
        painting.executeTask();

        Assert.assertEquals(true, painting.isTaskExecuted());
        Assert.assertEquals("Room", painting.getTaskName());
    }

    @Test
    public void testFactoryDrivingTask() {
        TaskFactory factory = new TaskFactory();

        Task driving = factory.makeTask(TaskFactory.DRIVINGTASK);
        driving.executeTask();

        Assert.assertEquals(true, driving.isTaskExecuted());
        Assert.assertEquals("Trip", driving.getTaskName());
    }
}
