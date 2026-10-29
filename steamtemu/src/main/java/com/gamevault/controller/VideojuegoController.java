package com.gamevault.controller;

import java.util.ArrayList;

import com.gamevault.model.InventarioDao;
import com.gamevault.model.Videojuego;

public class VideojuegoController {
    private InventarioDao inventarioDao;

    public VideojuegoController(){
        inventarioDao = new InventarioDao();
    }
    public ArrayList<Videojuego> getVideojuegos(){
        return inventarioDao.getVideojuegos();
    }
}
