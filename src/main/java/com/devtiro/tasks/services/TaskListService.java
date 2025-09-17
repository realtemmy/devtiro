package com.devtiro.tasks.services;

import com.devtiro.tasks.domain.entities.TaskList;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskListService {
    List<TaskList> listTaskList();
    TaskList createTaskList(TaskList taskList);
    Optional<TaskList> getTaskList (UUID id);
    TaskList updateTaskList(UUID taskListId,TaskList taskList);
    void deletetaskList(UUID taskListId);
}
