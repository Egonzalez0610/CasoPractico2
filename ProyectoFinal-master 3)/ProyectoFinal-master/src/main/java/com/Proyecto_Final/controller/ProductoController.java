package com.Proyecto_Final.controller;

import com.Proyecto_Final.domain.Producto;
import com.Proyecto_Final.service.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/producto/agregar/{idProducto}")
    public String agregarProducto(Model model, Producto producto) {
        productoService.saveProducto(producto);
        var lista = productoService.getProductos();
        model.addAttribute("listaProductos", lista);
        return "";
    }

    @GetMapping("/producto/listado")
    public String listado(Model model) {
        var productos = productoService.getProductos();
        model.addAttribute("productos", productos);
        model.addAttribute("totalProductos", productos.size());
        return "/producto/listado";
    }

    @PostMapping("/producto/guardar")
    public String guardarProducto(Producto producto, Model model) {
        productoService.saveProducto(producto);
        var productos = productoService.getProductos();
        model.addAttribute("productos", productos);
        model.addAttribute("totalProductos", productos.size());
        return "redirect:/producto/listado";
    }

    @GetMapping("/producto/modificar/{idProducto}")
    public String modificarProducto(Producto producto, Model model) {
        producto = productoService.getProducto(producto);
        model.addAttribute("producto", producto);
        return "/producto/modificar";
    }

    @GetMapping("/producto/eliminar/{idProducto}")
    public String eliminarProducto(Producto producto, Model model) {
        productoService.deleteProducto(producto);
        var productos = productoService.getProductos();
        model.addAttribute("productos", productos);
        model.addAttribute("totalProductos", productos.size());
        return "redirect:/producto/listado";
    }
}
