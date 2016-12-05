/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.stub;

import com.eci.cosw.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Santiago Carrillo
 */
@Service
public class TaskStubImpl implements TaskStub {
    private List<Task> tasks= new ArrayList<>();
    
    @Override
    public List<Task> getTasks() {
     
        return tasks;
    }

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }
    
}
