package com.eci.cosw.stub;

import com.eci.cosw.model.*;
//import com.eci.cosw.persistence.*;
import com.eci.cosw.utils.*;

import java.util.*;
//import org.springframework.beans.factory.annotation.*;

/**
 * Created by Julian Gonzalez Prieto (Avuuna, la Luz del Alba) on 27/09/2016.
 */
public class UsersStubImpl implements UsersStub {

//    @Autowired
//    private UsuariosRepository repository;

    private static List<Usuario> users;

    static {
        users = new ArrayList();

        // Usuarios y contrasenas - quemado en codigo
        users.add(new Usuario("user", Hashing.sha1("password")));
        users.add(new Usuario("julian", Hashing.sha1("avuuna")));
        users.add(new Usuario("diana", Hashing.sha1("diana")));
        users.add(new Usuario("juan", Hashing.sha1("juan")));
        users.add(new Usuario("jose", Hashing.sha1("jose")));
        users.add(new Usuario("ramiro", Hashing.sha1("ramiro")));
    }

    @Override
    public List<Usuario> getUsers() {
//        return repository.getUsuarios();
        return users;
    }
}
