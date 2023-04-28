package com.Proyecto_Final.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    private String nombre;
    private String correo;
    private String direccion;
    private String usuario;
    private String contra;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nombre, String correo, String direccion, String usuario, String contra) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.usuario = usuario;
        this.contra = contra;
    }



}
