/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.controller;

import com.eci.cosw.model.Task;
import com.eci.cosw.stub.TaskStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Santiago Carrillo
 */
@RestController
@RequestMapping(value = "/task")
public class TaskController {

    @Autowired
    TaskStub taskStub;

    public TaskController() {

    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Task> getTask() {
        return taskStub.getTasks();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void postTask(@RequestBody Task task) {
        taskStub.addTask(task);
    }
}
