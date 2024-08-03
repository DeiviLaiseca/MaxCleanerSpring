
package com.maxcleaner.MaxCleanerSpring.controller;

import com.maxcleaner.MaxCleanerSpring.model.RegistroUsuario;
import com.maxcleaner.MaxCleanerSpring.services.RegistroUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class RegistroUsuarioController {
    
    @Autowired
    private RegistroUsuarioService registoUsuarioService;
    
    @PostMapping("/registrar")
    public RegistroUsuario newRegistroUsuario(@RequestBody RegistroUsuario newRegistroUsuario){
        return this.registoUsuarioService.newRegistroUsuario(newRegistroUsuario );
    }
    
    @GetMapping("/mostrar")
    public Iterable<RegistroUsuario> getAll(){
        return this.registoUsuarioService.getAll();
    }
    
    @PostMapping("/modificar")
    public RegistroUsuario modifyRegistroUsuario(@RequestBody RegistroUsuario usuario){
        return this.registoUsuarioService.modifyRegistroUsuario(usuario);
    }
    
    @PostMapping(value="/{id}")
    public boolean deleteRegistroUsuario(@PathVariable(value="id") int id){
        return this.registoUsuarioService.deleteRegistroUsuario(id);
    }
    
    
}
