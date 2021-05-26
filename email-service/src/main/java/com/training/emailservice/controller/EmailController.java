package com.training.emailservice.controller;

import com.training.emailservice.entity.BugRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @RequestMapping(method = RequestMethod.POST, path = "/email")
    public void sendEmail(@RequestBody BugRequest bugRequest) {
        System.out.println(bugRequest);
    }
}
