/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw;

import com.eci.cosw.stub.*;
import org.junit.*;

import static org.junit.Assert.*;

/**
 *
 * @author jose
 */
public class UsuariosTest {
    
    @Test
    public void getUsuarioPorUsername() {
        UsersStub us = new UsersStubImpl();
        String username = "pepito";
        assertNotNull(us.getUserByUsername(username));
    }
}
