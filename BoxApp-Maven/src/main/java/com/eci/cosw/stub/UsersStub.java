package com.eci.cosw.stub;

import com.eci.cosw.model.*;
import java.util.*;

/**
 * Created by Julian Gonzalez Prieto (Avuuna, la Luz del Alba) on 27/09/2016.
 */
public interface UsersStub {

    /**
     * Para el login.
     *
     * @return
     */
    public List getUsers();

    /**
     * Permite registrar un usuario.
     *
     * @param user
     */
    public void addUser(Usuario user);

    /**
     * Obtiene el usuario dado su username.
     *
     * @param username Username del usuario.
     * @return
     */
    public Usuario getUserByUsername(String username);

    /**
     * Obtiene el usuario dado su email.
     *
     * @param email Email del usuario.
     * @return
     */
    public Usuario getUserByEmail(String email);

    /**
     * Logea a un usuario dado su username o email y su password.
     *
     * @param name Username o Email del usuario.
     * @param pass Password del usuario.
     * @return
     */
    public Usuario loginUser(String name, String pass);
}
