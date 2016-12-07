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
    private Date Ida;
    private Date Llegada;
    
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

    public Date getIda() {
        return Ida;
    }

    public void setIda(Date ida) {
        this.Ida = ida;
    }

    public Date getLlegada() {
        return Llegada;
    }

    public void setLlegada(Date llegada) {
        this.Llegada = llegada;
    }
      
    
}
