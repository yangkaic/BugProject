package com.training.bugApplication.repository;

import com.training.bugApplication.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProjectRepository extends JpaRepository<Project, Long> {
}
