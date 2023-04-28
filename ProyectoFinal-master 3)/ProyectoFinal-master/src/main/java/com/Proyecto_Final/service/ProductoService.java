package com.Proyecto_Final.service;

import com.Proyecto_Final.domain.Producto;
import java.util.ArrayList;
import java.util.List;

public interface ProductoService {

    public List<Producto> listaProductos = new ArrayList<>();

    public List<Producto> getProductos();

    public void saveProducto(Producto producto);

    public void deleteProducto(Producto producto);

    public Producto getProducto(Producto producto);

}
