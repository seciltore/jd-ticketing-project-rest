package com.teapot.service;

import com.teapot.dto.ProjectDTO;
import com.teapot.entity.Project;
import com.teapot.entity.User;

import java.util.List;

public interface ProjectService {

    ProjectDTO getByProjectCode(String code);
    List<ProjectDTO> listAllProjects();
    Project save(ProjectDTO dto);
    void update(ProjectDTO dto);
    void delete(String code);

    void complete(String projectCode);

    List<ProjectDTO> listAllProjectDetails();

    List<ProjectDTO> readAllByAssignedManager(User user);

    List<ProjectDTO> listAllNonCompletedProjects();
}
