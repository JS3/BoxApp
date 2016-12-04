package com.eci.cosw.stub;

import com.eci.cosw.model.*;
import java.util.*;

/**
 * Created by Julian Gonzalez Prieto (Avuuna, la Luz del Alba) on 27/09/2016.
 */
public interface UsersStub {

    /**
     * Para el login.
     * @return 
     */
    public List getUsers();

    /**
     * Permite registrar un usuario.
     * @param user 
     */
    public void addUser(Usuario user);
}
