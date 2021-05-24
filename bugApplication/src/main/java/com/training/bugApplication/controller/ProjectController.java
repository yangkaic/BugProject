package com.training.bugApplication.controller;

import com.training.bugApplication.entity.Project;
import com.training.bugApplication.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ProjectController {

    @Autowired
    IProjectService projectService;

    @RequestMapping(method = RequestMethod.POST, value = "/project")
    Long createProject(@Valid @RequestBody Project project) {
        return projectService.createProject(project);
    }
}
