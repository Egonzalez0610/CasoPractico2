package com.Proyecto_Final.service.impl;

import com.Proyecto_Final.dao.UsuarioDao;
import com.Proyecto_Final.domain.Usuario;
import com.Proyecto_Final.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> getUsuarios() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    public Usuario getUsuario(Usuario usuario) {
        return usuarioDao.findById(usuario.getIdUsuario()).orElse(null);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        usuarioDao.delete(usuario);
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        usuarioDao.save(usuario);
    }

}
