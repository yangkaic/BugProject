package com.training.bugApplication.controller;

import com.training.bugApplication.entity.BugRequest;
import com.training.bugApplication.service.BugService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@CrossOrigin
public class BugController {

    @Autowired
    BugService bugService;

    @RequestMapping(method = RequestMethod.GET, value = "/bug/{id}")
    public void getBug(@PathVariable Long id) {
        System.out.println("get bug called");
        System.out.println("bug id" + id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/bug")
    public void getAllBug() {
        System.out.println("get all bugs called");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/bug")
    @ApiOperation(consumes = "application/json", value = "create Bug")
    public void createNewBug(@Valid @RequestBody BugRequest bugRequest) throws Exception{
        bugService.create(bugRequest);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/bug/{id}")
    public void updateBug(@RequestBody BugRequest bugRequest, @PathVariable Long id) {
        System.out.println("update bug called");
        System.out.println(bugRequest.toString());
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/bug/{id}")
    public void deleteBug(@PathVariable Long id) {
        System.out.println("update bug called");
    }
}
