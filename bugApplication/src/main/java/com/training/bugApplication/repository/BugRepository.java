package com.training.bugApplication.repository;

import com.training.bugApplication.entity.BugRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BugRepository extends JpaRepository<BugRequest, Long> {
}
