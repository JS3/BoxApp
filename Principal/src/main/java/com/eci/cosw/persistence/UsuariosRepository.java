/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.persistence;

import com.eci.cosw.model.*;
import java.util.*;
//import org.springframework.data.jpa.repository.*;

/**
 *
 * @author User
 */
public interface UsuariosRepository /*extends JpaRepository<Usuario, String>*/ {

//    @Query("select u from Usuario u")
    List<Usuario> getUsuarios();
}
