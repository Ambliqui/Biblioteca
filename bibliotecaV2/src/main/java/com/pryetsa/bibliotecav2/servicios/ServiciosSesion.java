/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.bibliotecav2.servicios;

import com.arelance.bibliotecaisi.beans.Libro;
import com.arelance.bibliotecaisi.beans.Sesion;
import com.arelance.bibliotecaisi.beans.Usuario;
import com.pryetsa.bibliotecav2.datosFichero.CommandFile;
import com.pryetsa.bibliotecav2.datosFichero.Escribir;
import com.pryetsa.bibliotecav2.datosFichero.Leer;
import com.pryetsa.bibliotecav2.datosFichero.PersistenciaLibro;
import java.util.HashSet;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author pryet
 */
public class ServiciosSesion {

    PersistenciaLibro pLibro;

    public ServiciosSesion(PersistenciaLibro pLibro) {
        this.pLibro = pLibro;
    }

    public Sesion login(Usuario usuario) {
        Set<Libro> libros = new HashSet<>();

        for (Map.Entry<Libro, Set<Usuario>> entry : pLibro.getRegistroLibros().entrySet()) {
            if (entry.getValue().contains(usuario)) {//si el libro tiene al usuario
                libros.add(entry.getKey());//añades el libro a la lista
            }
        }
        System.out.println("tienes " + libros + " libros");
        return new Sesion(usuario, libros);
    }
    
    public Sesion logOut(Sesion sesion){
        return sesion=null; 
    }
    
    public Sesion actualizarSesion(Usuario usuario) {
        Set<Libro> libros = new HashSet<>();
        for (Map.Entry<Libro, Set<Usuario>> entry : pLibro.getRegistroLibros().entrySet()) {
            if (entry.getValue().contains(usuario)) {//si el libro tiene al usuario
                libros.add(entry.getKey());//añades el libro a la lista
            }
        }
        return new Sesion(usuario, libros);
    }
    
}
