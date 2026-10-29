package com.gamevault.controller;

import com.gamevault.model.UserDao;
import com.gamevault.model.Usuario;

public class UserController {
    public Usuario buscarUsuarioPorRut(String rut){
        UserDao userDao = new UserDao();
        Usuario usuario = userDao.buscarUsuarioPorRut(rut);
        return usuario;
    }
}
