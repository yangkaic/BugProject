package com.training.bugApplication.service;

import com.training.bugApplication.entity.BugRequest;

public interface BugService {

    public void create(BugRequest bugRequest) throws Exception;
}
