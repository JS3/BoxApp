/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.model;

/**
 *
 * @author Julian Gonzalez Prieto (Anacoreta Avuuna, la Luz del Alba).
 */
public class Usuario {

    private String user, email, password, rol;

    public Usuario() {
    }

    public Usuario(String user, String email, String password, String rol) {
        setUser(user);
        setEmail(email);
        setPassword(password);
        setRol(rol);
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}