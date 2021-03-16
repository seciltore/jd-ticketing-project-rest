package com.teapot.service;

import com.teapot.dto.ProjectDTO;
import com.teapot.dto.TaskDTO;
import com.teapot.entity.Task;
import com.teapot.entity.User;
import com.teapot.enums.Status;

import java.util.List;

public interface TaskService {

    TaskDTO findById(Long id);
    List<TaskDTO> listAllTasks();
    Task save(TaskDTO dto);
    void update(TaskDTO dto);
    void delete(long id);

    int totalNonCompletedTasks(String projectCode);
    int totalCompletedTasks(String projectCode);

    void deleteByProject(ProjectDTO project);

    List<TaskDTO> listAllByProject(ProjectDTO project);

    List<TaskDTO> listAllTasksByStatusIsNot(Status status);

    List<TaskDTO> listAllTasksByProjectManager();

    void updateStatus(TaskDTO dto);

    List<TaskDTO> listAllTasksByStatus(Status status);

    List<TaskDTO> readAllByEmployee(User assignedEmployee);
}
