/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.bibliotecav2.datosFichero;

import com.arelance.bibliotecaisi.beans.Libro;
import com.arelance.bibliotecaisi.beans.Usuario;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author pryet
 */
public class PersistenciaLibro implements Serializable{
    private static final long serialVersionUID = 1L;
    private final Map<Libro,Set<Usuario>> registroLibros;

    public PersistenciaLibro(Map<Libro, Set<Usuario>> registroLibros) {
        this.registroLibros = registroLibros;
    }

    public Map<Libro, Set<Usuario>> getRegistroLibros() {
        return registroLibros;
    }
    
    
    
}
