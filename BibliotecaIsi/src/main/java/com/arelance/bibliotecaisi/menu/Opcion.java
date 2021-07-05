/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.menu;

import java.util.Objects;

/**
 *
 * @author Mefisto
 */
public class Opcion {
    
    private String label;
    private AccionUsuario accion;

    public Opcion(String label, AccionUsuario accion) {
        this.label = label;
        this.accion = accion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.label);
        hash = 31 * hash + Objects.hashCode(this.accion);
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
        final Opcion other = (Opcion) obj;
        if (!Objects.equals(this.label, other.label)) {
            return false;
        }
        if (!Objects.equals(this.accion, other.accion)) {
            return false;
        }
        return true;
    }

    public String getLabel() {
        return label;
    }

    public AccionUsuario getAccion() {
        return accion;
    }
}
