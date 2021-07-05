/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.beans;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author pryet
 */
public class Sesion {
    private Usuario usuario;
    private Set<Libro> libros;

    public Sesion(Usuario usuario) {
        this.usuario = usuario;
        libros=new HashSet<Libro>();
    }
    
    public Sesion(Usuario usuario,Set<Libro> libros){
        this.usuario=usuario;
        this.libros=libros;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }
    
    
}
