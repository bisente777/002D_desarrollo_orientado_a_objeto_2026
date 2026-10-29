package com.gamevault.model;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonObject;



public class InventarioDao {
    ArrayList<Videojuego> lista_juegos = new ArrayList<>();

    public InventarioDao() {
        loadDataJuegos();
    }
    
    public void loadDataJuegos(){
         InputStream cadena = getClass().getResourceAsStream("/Inventario.json");
         if (cadena == null){
             throw new IllegalStateException(
                    "No se encontró biblioteca.json en resources");
        }
         try (InputStreamReader lector = new InputStreamReader(cadena)){
            Gson gson = new Gson();
            JsonObject[] videojuegos = gson.fromJson(lector, JsonObject[].class);
            for (JsonObject juego : videojuegos){
                String tipo = juego.get("tipo").getAsString();

    switch (tipo) {
        case "fisico":
            String titulo_fisico = juego.get("titulo").getAsString();
            String plataforma_fisico = juego.get("plataforma").getAsString();
            String url_fisico = juego.get("portada").getAsString();
            int stock_fisico = juego.get("stockTienda").getAsInt();
            int peso_gramos_fisico = juego.get("pesoGramos").getAsInt();

            
            JuegoFisico juegoFisico = new JuegoFisico(
                titulo_fisico, plataforma_fisico, url_fisico, stock_fisico, peso_gramos_fisico);
            lista_juegos.add(juegoFisico);

            break;

        case "digital":
            String titulo_digital = juego.get("titulo").getAsString();
            String plataforma_digital = juego.get("plataforma").getAsString();
            String url_digital = juego.get("portada").getAsString();
            
            
            int tamanoGB_digital = juego.get("tamanoGB").getAsInt();
            String codigoActivacion_digital = juego.get("codigoActivacion").getAsString();

        
            JuegoDigital juegoDigital = new JuegoDigital(titulo_digital, plataforma_digital, url_digital, tamanoGB_digital, codigoActivacion_digital);
            lista_juegos.add(juegoDigital);

            break;

        default:
            System.out.println("Tipo de juego desconocido: " + tipo);
            break;
            } 
        }
     } catch (java.io.IOException e) {
            throw new IllegalStateException(
                    "No se pudo leer biblioteca.json", e);
        }
    }
     public ArrayList<Videojuego>getVideojuegos() {
        return lista_juegos;
    }

    public void mostrarJuegos() {
        for (Videojuego juego : lista_juegos) {
            System.out.println(juego.getTitulo());
        }
    }
}



 

