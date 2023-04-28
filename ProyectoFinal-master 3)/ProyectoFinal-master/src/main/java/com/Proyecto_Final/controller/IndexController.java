package com.Proyecto_Final.controller;

import com.Proyecto_Final.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/")
    public String inicio(Model model) {

        return "index";
    }

    @GetMapping("/desplegar/historia")
    public String historia(Model model) {
        return "historia";
    }

    @GetMapping("/desplegar/variantes")
    public String variantes(Model model) {
        return "variantes";
    }

    @GetMapping("/desplegar/caracteristicas")
    public String caracteristicas(Model model) {
        return "caracteristicas";
    }

    @GetMapping("desplegar/productos")
    public String inicio2(Model model) {
        var productos = productoService.getProductos();
        model.addAttribute("productos", productos);
        return "/producto/listado";
    }

}
