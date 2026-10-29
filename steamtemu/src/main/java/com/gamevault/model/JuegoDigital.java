package com.gamevault.model;

public class JuegoDigital extends Videojuego {
    private int tamaño_gb;
    private String codigo_activacion;
    public int getTamaño_gb() {
        return tamaño_gb;
    }
    public void setTamaño_gb(int tamaño_gb) {
        this.tamaño_gb = tamaño_gb;
    }
    public String getCodigo_activacion() {
        return codigo_activacion;
    }
    public void setCodigo_activacion(String codigo_activacion) {
        this.codigo_activacion = codigo_activacion;
    }
    public JuegoDigital(String titulo, String plataforma, String portada, int tamaño_gb, String codigo_activacion) {
        super(titulo, plataforma, portada);
        this.tamaño_gb = tamaño_gb;
        this.codigo_activacion = codigo_activacion;
    }
    @Override
    public String detalle() {
        return this.getTamaño_gb() + "GB";
    }
    @Override
    public String tipojuego() {
        return "Digital";
    }
}
