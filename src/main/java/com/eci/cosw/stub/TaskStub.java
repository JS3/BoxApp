/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.stub;


import com.eci.cosw.model.Task;

import java.util.List;

/**
 * @author Santiago Carrillo
 */
public interface TaskStub {

    List<Task> getTasks();

    void addTask(Task task);
}
