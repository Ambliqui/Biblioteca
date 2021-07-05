/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.beans;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author pryet
 */
public final class Libro implements Serializable{
    private static final long serialVersionUID = 1L;
    private final String titulo;
    private final String ISBN;

    public Libro(String titulo,String ISBN) {
        this.titulo = titulo;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.ISBN);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.ISBN, other.ISBN)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "\nLibro{" + "titulo=" + titulo + ", ISBN=" + ISBN + '}';
    }
    
    
}
