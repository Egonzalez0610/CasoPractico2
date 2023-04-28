package com.Proyecto_Final.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Long idPedido;

    private String nombre;
    private String correo;
    private String direccion;
    private String usuario;
    private String contra;

    public Pedido() {
    }

    public Pedido(String nombre, String correo, String direccion, String usuario, String contra) {
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.usuario = usuario;
        this.contra = contra;
    }

}
