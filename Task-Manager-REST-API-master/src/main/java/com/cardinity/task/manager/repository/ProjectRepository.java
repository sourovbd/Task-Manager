package com.cardinity.task.manager.repository;

import com.cardinity.task.manager.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    Project getByName(String projectName);
}
