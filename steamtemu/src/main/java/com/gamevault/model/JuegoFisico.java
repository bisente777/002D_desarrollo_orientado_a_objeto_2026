package com.gamevault.model;

public class JuegoFisico extends Videojuego {
    private int stock_tienda;
    private int peso;
    public int getStock_tienda() {
        return stock_tienda;
    }
    public void setStock_tienda(int stock_tienda) {
        this.stock_tienda = stock_tienda;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public JuegoFisico(String titulo, String plataforma, String portada, int stock_tienda, int peso) {
        super(titulo, plataforma, portada);
        this.stock_tienda = stock_tienda;
        this.peso = peso;
    }
    @Override
    public String detalle() {
        return this.getStock_tienda() + "Unidades";
    }
    @Override
    public String tipojuego() {
        return "Fisico";
    }
}
