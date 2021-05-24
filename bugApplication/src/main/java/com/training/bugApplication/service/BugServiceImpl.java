package com.training.bugApplication.service;

import com.training.bugApplication.entity.BugRequest;
import com.training.bugApplication.repository.BugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BugServiceImpl implements  BugService {

    @Autowired
    BugRepository bugRepository;

    public void create(BugRequest bugRequest) {
        System.out.println(bugRequest);
        bugRepository.save(bugRequest);
    }
}
