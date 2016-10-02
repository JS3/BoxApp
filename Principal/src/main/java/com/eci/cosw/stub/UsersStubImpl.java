package com.eci.cosw.stub;

import com.eci.cosw.utils.Hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Julian Gonzalez Prieto (Avuuna, la Luz del Alba) on 27/09/2016.
 */
public class UsersStubImpl implements UsersStub {
    private static Map<String, String> users;

    static {
        users = new HashMap<String, String>();

        // Usuarios y contrasenas - quemado en codigo
        users.put("julian", Hashing.sha1("avuuna"));
        users.put("diana", Hashing.sha1("diana"));
        users.put("juan", Hashing.sha1("juan"));
        users.put("ramiro", Hashing.sha1("ramiro"));
        users.put("jose", Hashing.sha1("jose"));
    }

    @Override
    public Map<String, String> getUsers() {
        return users;
    }
}
