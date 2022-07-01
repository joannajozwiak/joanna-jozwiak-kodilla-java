package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.config.Task;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testContext() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        //When
        boolean board = context.containsBean("board");
        boolean toDoList = context.containsBean("toDoList");
        boolean inProgressList = context.containsBean("inProgressList");
        boolean doneList = context.containsBean("doneList");
        //Then
        System.out.println("Bean board was found in the container: " + board);
        System.out.println("Bean toDoList was found in the container: " + toDoList);
        System.out.println("Bean inProgressList was found in the container: " + inProgressList);
        System.out.println("Bean doneList was found in the container: " + doneList);
    }

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList toDoList = context.getBean("toDoList", TaskList.class);
        TaskList inProgressList = context.getBean("inProgressList", TaskList.class);
        TaskList doneList = context.getBean("doneList", TaskList.class);

        //When & Then
        doneList.getTasks().add("task1");
        inProgressList.getTasks().add("task2");
        toDoList.getTasks().add("task3");

        Assertions.assertEquals("task1", board.getDoneList().getTasks().get(0));
        Assertions.assertEquals("task2", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("task3", board.getToDoList().getTasks().get(0));
    }
}
