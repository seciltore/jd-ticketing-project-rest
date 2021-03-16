package com.teapot.repository;

import com.teapot.entity.Project;
import com.teapot.entity.User;
import com.teapot.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {

    Project findByProjectCode(String code);
    List<Project> findAllByAssignedManager(User manager);

    List<Project> findAllByProjectStatusIsNot(Status status);

}