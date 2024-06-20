package com.certificados.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class UsuarioModel extends PersonaModel {
    private String rol;

    public UsuarioModel() {
    }

    public UsuarioModel(String rol, int ci, String email, String materno, String nombre, String parterno) {
        super(ci, email, materno, nombre, parterno);
        this.rol = rol;
    }



    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    



}
