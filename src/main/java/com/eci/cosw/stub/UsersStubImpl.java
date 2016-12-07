package com.eci.cosw.stub;

import com.eci.cosw.model.*;
import com.eci.cosw.utils.*;

import java.util.*;

/**
 * Created by Julian Gonzalez Prieto (Avuuna, la Luz del Alba) on 27/09/2016.
 */
public class UsersStubImpl implements UsersStub {

    private static List<Usuario> users;

    static {
        users = new ArrayList();
        String rolUser = "USER";

        // Usuarios y contrasenas - quemado en codigo
        users.add(new Usuario("user", "user@login.com", Hashing.sha1("password"), rolUser));
        users.add(new Usuario("julian", "julian@boxapp.dev", Hashing.sha1("avuuna"), rolUser));
        users.add(new Usuario("diana", "diana@boxapp.dev", Hashing.sha1("diana"), rolUser));
        users.add(new Usuario("juan", "juan@boxapp.dev", Hashing.sha1("juan"), rolUser));
        users.add(new Usuario("jose", "jose@boxapp.dev", Hashing.sha1("jose"), rolUser));
        users.add(new Usuario("ramiro", "ramiro@boxapp.dev", Hashing.sha1("ramiro"), rolUser));
    }

    @Override
    public List<Usuario> getUsers() {
        return users;
    }

    @Override
    public void addUser(Usuario user) {
        users.add(user);
    }

    @Override
    public Usuario getUserByUsername(String username) {
        Usuario response = null;
        for (Usuario user : users) {
            if (user.getUser().equals(username)) {
                response = user;
                break;
            }
        }
        return response;
    }

    @Override
    public Usuario getUserByEmail(String email) {
        Usuario response = null;
        for (Usuario user : users) {
            if (user.getEmail().equals(email)) {
                response = user;
                break;
            }
        }
        return response;
    }

    @Override
    public Usuario loginUser(String name, String pass) {
        Usuario response = null;
        for (Usuario user : users) {
            if ((user.getUser().equals(name) || user.getEmail().equals(name)) && user.getPassword().equals(pass)) {
                response = user;
                break;
            }
        }
        return response;
    }
}
