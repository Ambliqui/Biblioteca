/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.beans;

import java.util.Set;

/**
 *
 * @author Mefisto
 */
public class Libreria {
    private Set<Libro> Libros;

    public Libreria(Set<Libro> Libros) {
        this.Libros = Libros;
    }

    public Libreria() {
    }

    public Set<Libro> getLibros() {
        return Libros;
    }

    public void setLibros(Set<Libro> Libros) {
        this.Libros = Libros;
    }
    
}
