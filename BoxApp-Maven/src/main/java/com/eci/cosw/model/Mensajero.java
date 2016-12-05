package com.eci.cosw.model;

import java.util.Date;


public class Mensajero extends Solicitante {

    private int calificacion;

    public Mensajero(){
    }

    public Mensajero(int idSolicitante, String nombre, String primerApellido, String segundoApellido, int cedula,
                     int edad, Date fechaNacimiento, int telefono, String direccion, String pais, String municipio,
                     int codigoPostal, int calificacion) {

        super(idSolicitante, nombre, primerApellido, segundoApellido, cedula, edad, fechaNacimiento, telefono,
                direccion, pais, municipio, codigoPostal);

        this.calificacion = calificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }
}
