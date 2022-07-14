package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite {

        private static final String DESCRIPTION = "Test: TaskList";

        @Autowired
        private TaskListDao taskListDao;


    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("ToDo",DESCRIPTION);
        taskListDao.save(taskList);
        String description = taskList.getDescription();

        //When
        List<TaskList> readTaskLists = taskListDao.findByListName("ToDo");

        //Then
        assertEquals(1, readTaskLists.size());

        //CleanUp
        int id = readTaskLists.get(0).getId();
        taskListDao.deleteById(id);
    }
    }

