/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.controller;

import com.eci.cosw.model.Viaje;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.eci.cosw.stub.Viajestub;

/**
 *
 * @author 2096904
 */
@RestController
@RequestMapping("/viajes")
public class ViajeController {
    
    @Autowired
    private Viajestub iter;
    
     private List<Viaje> viaje = new ArrayList<>();
   

    @RequestMapping(method=RequestMethod.GET)
    public List<Viaje> getViajes() {
        return iter.getViajes();
    }

    @RequestMapping(method=RequestMethod.POST)
    public  ResponseEntity<?>  postViaje(@RequestBody Viaje v) {
        iter.postViaje(v);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    

}
