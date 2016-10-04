/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.stub;

import com.eci.cosw.model.Viaje;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class StubViajeImpl implements Viajestub {
    
    private List<Viaje> viaje = new ArrayList<>();
    
    @Override
    public List<Viaje> getViajes() {
        return viaje;
    }

    @Override
    public void postViaje(Viaje v) {
        viaje.add(v);
    }
    
}
