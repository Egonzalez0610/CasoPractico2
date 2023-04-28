package com.Proyecto_Final.service;

import com.Proyecto_Final.domain.Usuario;
import java.util.List;

public interface UsuarioService {

    //obtiene una lista de registros de la tabla usuario y lo coloca en una lista de objetos usuario
    public List<Usuario> getUsuarios();

    //obtiene un registro de la tabla usuario que tiene guardado el objeto usuario
    public Usuario getUsuario(Usuario usuario);

    public void deleteUsuario(Usuario usuario);

    //si el idUsuario no existe o es nulo, se crea un registro nuevo
    public void saveUsuario(Usuario usuario);

}
