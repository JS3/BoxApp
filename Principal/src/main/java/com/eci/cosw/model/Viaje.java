/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.model;

import java.util.Date;

/**
 *
 * @author 2096904
 */
public class Viaje {
    private String Origen;
    private String Destino;
    private String Ida;
    private String Llegada;
    
    public Viaje(){
    
    }
    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getIda() {
        return Ida;
    }

    public void setIda(String ida) {
        this.Ida = ida;
    }

    public String getLlegada() {
        return Llegada;
    }

    public void setLlegada(String llegada) {
        this.Llegada = llegada;
    }
      
    
}
