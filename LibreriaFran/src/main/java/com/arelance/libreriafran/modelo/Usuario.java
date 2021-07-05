/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafran.modelo;

import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Usuario implements Serializable {

    private Map<Credenciales, DatosPersonales> usuarios;

    public Usuario(Map<Credenciales, DatosPersonales> usuarios) {
        this.usuarios = usuarios;
    }

    public Map<Credenciales, DatosPersonales> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Map<Credenciales, DatosPersonales> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuarios=" + usuarios + '}';
    }

    public Usuario() {
    }

    

    
}
