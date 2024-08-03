package com.maxcleaner.MaxCleanerSpring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 Tabla para registro de usuarios
 */

@Entity
@Data
public class RegistroUsuario {
    
    @Id
    @Column
    private int id;
    
    @Column
    private String nombre;
    
    @Column
    private String tipoUsuario;
    
    @Column
    private String contrasena;
    
    @Column
    private String correoElectronico;
    
}
