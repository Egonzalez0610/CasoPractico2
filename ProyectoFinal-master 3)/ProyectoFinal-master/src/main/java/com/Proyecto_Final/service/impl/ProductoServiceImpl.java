
package com.Proyecto_Final.service.impl;

import com.Proyecto_Final.service.ProductoService;
import com.Proyecto_Final.domain.Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {

    public List<Producto> listaProductos = new ArrayList<>();

    public ProductoServiceImpl() {
        listaProductos.add(new Producto(1, "Geisha", "Tueste Oscuro", 15000));
        listaProductos.add(new Producto(2, "Sarchimor", "Tueste Medio", 10000));
        listaProductos.add(new Producto(3, "Catuai", "Tueste Oscuro", 12000));
        listaProductos.add(new Producto(4, "Bourbon", "Tueste Claro", 9000));
        listaProductos.add(new Producto(5, "Typica", "Tueste Medio", 11000));
    }
    @Override
    public Producto getProducto(Producto producto) {
        for (var a : listaProductos) {
            if (Objects.equals(a.getIdProducto(), producto.getIdProducto())) {
                return a;
            }
        }
        return null;
    }

    @Override
    public List<Producto> getProductos() {
        return listaProductos;
    }

    @Override
    public void saveProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
