/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.bibliotecav2.servicios;

import com.arelance.bibliotecaisi.beans.Libro;
import com.arelance.bibliotecaisi.beans.Sesion;
import com.arelance.bibliotecaisi.beans.Usuario;
import com.pryetsa.bibliotecav2.datosFichero.PersistenciaLibro;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author pryet
 */
public class ServiciosLibro {
    private PersistenciaLibro pLibro;

    public ServiciosLibro(PersistenciaLibro pLibro) {
        this.pLibro = pLibro;
    }
    
    public boolean alquilar(Usuario usuario,Libro libro){
        if(pLibro.getRegistroLibros().containsKey(libro)){
            for (Map.Entry<Libro, Set<Usuario>> entry : pLibro.getRegistroLibros().entrySet()) {
                if(entry.getKey().equals(libro)){
                    entry.getValue().add(usuario);
                    return true;
                }
            }
        }
        return false;
    } 
    
    public boolean devolverLibro(Usuario usuario, Libro libro){
        return pLibro.getRegistroLibros().get(libro).remove(usuario);        
    }

    public Set<Libro> librosAlquilables(Sesion sesion, Set<Libro> librosBBDD){
        return librosBBDD.stream().filter(libro -> (!sesion.getLibros().contains(libro))).collect(Collectors.toSet());
    }
}
