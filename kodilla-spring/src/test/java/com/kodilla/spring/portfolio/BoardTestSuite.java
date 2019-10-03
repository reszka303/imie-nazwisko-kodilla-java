package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        List<String> toDo = board.getToDoList().getTask();
        toDo.add("Task to do");

        List<String> inProgress = board.getInProgressList().getTask();
        inProgress.add("Task in progress");

        List<String> done = board.getDoneList().getTask();
        done.add("Task done");

        Assert.assertEquals("Task to do", toDo.get(0));
        Assert.assertEquals("Task in progress", inProgress.get(0));
        Assert.assertEquals("Task done", done.get(0));
    }
}
