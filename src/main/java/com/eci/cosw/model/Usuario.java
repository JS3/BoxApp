/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.model;

import java.io.*;
import javax.persistence.*;

/**
 *
 * @author Julian Gonzalez Prieto (Anacoreta Avuuna, la Luz del Alba).
 */
//@Entity
//@Table(name = "Usuarios")
public class Usuario implements Serializable {

    private String user, email, password, rol;
//    private Solicitante solicitante;

    public Usuario() {
    }

    public Usuario(String user, String email, String password, String rol) {
        setUser(user);
        setEmail(email);
        setPassword(password);
        setRol(rol);
    }

//    @Id
//    @Column(name = "correo", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    @Column(name = "username", nullable = false, unique = true)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

//    @Column(name = "contrasena", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "Solicitante_idSolicitante")
//    public Solicitante getSolicitante() {
//        return solicitante;
//    }
//
//    public void setSolicitante(Solicitante solicitante) {
//        this.solicitante = solicitante;
//    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
