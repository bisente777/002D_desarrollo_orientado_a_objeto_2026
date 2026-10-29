package com.gamevault.model;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.google.gson.Gson;

public class UserDao {
    ArrayList<Usuario> lista_usuarios = new ArrayList<>();
    public UserDao() {
        loadDataUsuarios();
    }
    

    public void loadDataUsuarios(){
        InputStream cadena = getClass().getResourceAsStream("/Usuario.json");

        InputStreamReader lector = new InputStreamReader(cadena);

        Gson gson = new Gson();

        Usuario[] usuarios = gson.fromJson(lector, Usuario[].class);

        for( Usuario usuario :  usuarios){
            lista_usuarios.add(usuario);
        }
    }


    public Usuario buscarUsuarioPorRut(String rut){
        for (Usuario usuario : lista_usuarios) {
            if (usuario.getRut().equals(rut)) {
                return usuario;
            }
        }
    return null;
    }
}
