package com.maxcleaner.MaxCleanerSpring.services;

import com.maxcleaner.MaxCleanerSpring.model.RegistroUsuario;

/**
Interface de servicio
 */
public interface RegistroUsuarioService {
    
    RegistroUsuario newRegistroUsuario(RegistroUsuario newRegistroUsuario);
    Iterable<RegistroUsuario> getAll();
    RegistroUsuario modifyRegistroUsuario(RegistroUsuario registroUsuario);
    Boolean deleteRegistroUsuario(int id);
    
}
