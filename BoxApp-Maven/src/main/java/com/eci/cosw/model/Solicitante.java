package com.eci.cosw.model;

import javax.persistence.*;
import java.util.Date;

//@Entity
//@Table(name = "Solicitante")
public class Solicitante {

    private int idSolicitante; //Autogenerado
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String genero;
    private int cedula;
    private int edad;
    private Date fechaNacimiento;
    private int telefono;
    private String direccion;
    private String pais;
    private String municipio;
    private int codigoPostal;

    public Solicitante (){
    }

    public Solicitante(int idSolicitante, String nombre, String primerApellido, String segundoApellido, int cedula,
                       int edad, Date fechaNacimiento, int telefono, String direccion, String pais, String municipio,
                       int codigoPostal)
    {
        this.idSolicitante = idSolicitante;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.cedula = cedula;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.pais = pais;
        this.municipio = municipio;
        this.codigoPostal = codigoPostal;
    }

    //@Id
    //@GeneratedValue
    public int getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(int idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    //@Column(name="nombre")
    public String getNombre() {
        return nombre;
    }

    //@Column(name="primerApellido")
    public String getPrimerApellido() {
        return primerApellido;
    }

    //@Column(name="segundoApellido")
    public String getSegundoApellido() {
        return segundoApellido;
    }

    //@Column(name="cedula")
    public int getCedula() {
        return cedula;
    }

    //@Column(name="edad")
    public int getEdad() {
        return edad;
    }

    //@Temporal(TemporalType.DATE)
    //@Column(name="fechaNacimiento")
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    //@Column(name="telefono")
    public int getTelefono() {
        return telefono;
    }

    //@Column(name="direccion")
    public String getDireccion() {
        return direccion;
    }

    //@Column(name="Pais")
    public String getPais() {
        return pais;
    }

    //@Column(name="municipio")
    public String getMunicipio() {
        return municipio;
    }

    //@Column(name="genero")
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //@Column(name="codigoPostal")
    public int getCodigoPostal() { return codigoPostal; }
}
