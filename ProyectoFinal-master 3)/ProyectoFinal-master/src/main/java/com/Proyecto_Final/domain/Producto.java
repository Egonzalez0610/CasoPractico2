package com.Proyecto_Final.domain;

import lombok.Data;

@Data
public class Producto {

    private int idProducto;
    private String nombre;
    private String tueste;
    private double precio;

    public Producto() {
    }

    public Producto(int idProducto, String nombre, String tueste, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.tueste = tueste;
        this.precio = precio;
    }
}
