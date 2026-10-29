package com.gamevault.view;

import com.gamevault.controller.VideojuegoController;
import com.gamevault.model.Videojuego;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class VideojuegosView {
    private TableView<Videojuego> tabla_videojuego;
    private VideojuegoController videojuegoController;

    public VideojuegosView(){
        videojuegoController = new VideojuegoController();
        configurarTabla();
        cargarVideojuegos();
    }
    private void configurarTabla(){
    tabla_videojuego = new TableView<>();
        TableColumn<Videojuego, String> columnaTitulo = new TableColumn<>("Titulo");
        columnaTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));

        TableColumn<Videojuego, String> columnaPlataforma = new TableColumn<>("Plataforma");
        columnaPlataforma.setCellValueFactory(new PropertyValueFactory<>("plataforma"));

        TableColumn<Videojuego, String> columnaPortada = new TableColumn<>("Portada");
        columnaPortada.setCellValueFactory(new PropertyValueFactory<>("portada"));

        tabla_videojuego.getColumns().add(columnaTitulo);
        tabla_videojuego.getColumns().add(columnaPlataforma);
        tabla_videojuego.getColumns().add(columnaPortada);
        
        tabla_videojuego.setFixedCellSize(110);
        columnaPortada.setCellFactory(columna -> {
            return new TableCell<Videojuego, String>(){
                private final ImageView vistaJuego = new ImageView();

                {
                    vistaJuego.setFitWidth(70);
                    vistaJuego.setFitHeight(100);
                    vistaJuego.setPreserveRatio(true);


                }
                @Override 
                protected void updateItem(String rutaImagen, boolean vacio){
                    super.updateItem(rutaImagen, vacio);
                    if (vacio || rutaImagen == null || rutaImagen.isBlank()){
                        setGraphic(null);
                        setText(null);
                    } else {
                        Image imagen = new Image(rutaImagen, true);

                        vistaJuego.setImage(imagen);

                        setGraphic(vistaJuego);
                        setText(null);
                    }
                } 
            };
        });
    }
    private void cargarVideojuegos(){
        ObservableList<Videojuego> videojuegos = FXCollections.observableArrayList(videojuegoController.getVideojuegos());
        tabla_videojuego.setItems(videojuegos);
       
    }
    public Scene videoJuegoScene(){
        VBox vbox_contenedor = new VBox(tabla_videojuego);
        Scene escena =  new Scene(vbox_contenedor, 720, 480);
        return escena;

    }
   
    }

