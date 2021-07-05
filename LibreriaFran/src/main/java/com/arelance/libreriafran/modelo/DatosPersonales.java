/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafran.modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class DatosPersonales implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellido;

    public DatosPersonales(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public DatosPersonales() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + Objects.hashCode(this.apellido);
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
        final DatosPersonales other = (DatosPersonales) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellido, other.apellido);
    }

    @Override
    public String toString() {
        return "DatosPersonales{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
}
