/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.bibliotecav2.datosFichero;

import com.arelance.bibliotecaisi.beans.DatosLogin;
import com.arelance.bibliotecaisi.beans.Usuario;
import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author pryet
 */
public class PersistenciaUsuario implements Serializable{
    private static final long serialVersionUID = 1L;
    private final Map<DatosLogin,Usuario> registroUsuarios;

    //leemos del archivo y cargamos el mapa
    public PersistenciaUsuario(Map<DatosLogin, Usuario> registroUsuarios) {
        this.registroUsuarios = registroUsuarios;
    }
    
    //lo recuperamos y hacemos el alta con .add()
    public Map<DatosLogin, Usuario> getRegistroUsuarios() {
        return registroUsuarios;
    }
    
    
}
