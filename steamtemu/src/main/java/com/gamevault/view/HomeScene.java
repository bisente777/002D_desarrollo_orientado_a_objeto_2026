package com.gamevault.view;

import com.gamevault.controller.UserController;
import com.gamevault.model.Usuario;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeScene {
    public Scene homeScene(){
        Label lbl_encabezado = new Label("GAME VAULT ------- STEAMTEMU");
        Label lbl_encabezadoBajo = new Label("Consulta Socio Gamer");
        TextField txf_consultarRut = new TextField();
        

        HBox hbox_encabezado = new HBox(10, lbl_encabezado, lbl_encabezadoBajo);


        Label lbl_rut = new Label("Rut: ----------");
        Label lbl_nombre = new Label("Nombre: ----------");
        Label lbl_email = new Label("Email: ----------");
        Label lbl_nivelGamer = new Label("Nivel Gamer: ----------");
        VBox vbox_informacionUsuario = new VBox(5, lbl_rut, lbl_nombre, lbl_email, lbl_nivelGamer);

        txf_consultarRut.setPromptText("Ej: 11.111.111-1");
        Button btn_buscarSocio = new Button("Buscar Socio");
        btn_buscarSocio.setOnAction(e -> {
            UserController userController = new UserController();
            String rut_abuscar = txf_consultarRut.getText();
            Usuario usuario_encontrado = userController.buscarUsuarioPorRut(rut_abuscar);
            if (rut_abuscar.isEmpty()) {
                lbl_rut.setText("Nombre: Por favor ingrese un RUT");
                return;
            }
            if (usuario_encontrado != null){
                lbl_rut.setText("Rut: " + usuario_encontrado.getRut());
                lbl_nombre.setText("Nombre: " + usuario_encontrado.getNombre());
                lbl_email.setText("Email: " + usuario_encontrado.getEmail());
                lbl_nivelGamer.setText("Nivel Gamer: " + usuario_encontrado.getNivelGamer());
            } else {
                lbl_rut.setText("Rut: " + rut_abuscar);
                lbl_nombre.setText("Nombre: Usuario no encontrado");
                lbl_email.setText("Email: ----------");
                lbl_nivelGamer.setText("Nivel Gamer: ----------");
            }
           

        
        });

        Label lbl_separador = new Label("------------------------------------------------------------------------------------");
        
        Button btn_verJuegos = new Button("Ver Inventario De Juegos");
       btn_verJuegos.setOnAction(e -> {
        try {
        VideojuegosView videojuegosView = new VideojuegosView();
        Scene escenaJuegos = videojuegosView.videoJuegoScene();

        Stage ventana = (Stage) btn_verJuegos.getScene().getWindow();
        ventana.setScene(escenaJuegos);
    } catch (Exception ex) {
        // Esto forzará a la terminal a imprimir el error oculto en letras rojas
        ex.printStackTrace();
    }
       });
     
        VBox hbox_buscarSocio = new VBox(txf_consultarRut, btn_buscarSocio, vbox_informacionUsuario);
        VBox pantalla_superior = new VBox(hbox_encabezado, hbox_buscarSocio, lbl_separador, btn_verJuegos);
        VBox main = new VBox(pantalla_superior);
        Scene home_Scene = new Scene(main, 720, 480);
        return home_Scene;
    }
}
