
package com.maxcleaner.MaxCleanerSpring.services;

import com.maxcleaner.MaxCleanerSpring.model.RegistroUsuario;
import com.maxcleaner.MaxCleanerSpring.repository.RegistroUsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroUsuarioImplement implements RegistroUsuarioService{
    
    @Autowired
    private RegistroUsuarioRepository registroUsuarioRepository;

    @Override
    public RegistroUsuario newRegistroUsuario(RegistroUsuario newRegistroUsuario) {
        return this.registroUsuarioRepository.save(newRegistroUsuario);
    }

    @Override
    public Iterable<RegistroUsuario> getAll() {
        return this.registroUsuarioRepository.findAll();
    }

    @Override
    public RegistroUsuario modifyRegistroUsuario(RegistroUsuario registroUsuario) {
        
        Optional<RegistroUsuario> usuarioEncontrado = this.registroUsuarioRepository.findById(registroUsuario.getId());
        
        if(usuarioEncontrado.get() != null){
            usuarioEncontrado.get().setNombre(registroUsuario.getNombre());
            usuarioEncontrado.get().setTipoUsuario(registroUsuario.getTipoUsuario());
            usuarioEncontrado.get().setCorreoElectronico(registroUsuario.getCorreoElectronico());
            usuarioEncontrado.get().setContrasena(registroUsuario.getContrasena());
            return this.newRegistroUsuario(usuarioEncontrado.get());
        }
        return null;
    }

    @Override
    public Boolean deleteRegistroUsuario(int id) {
        this.registroUsuarioRepository.deleteById(id);
        return true;
    }
    
}
