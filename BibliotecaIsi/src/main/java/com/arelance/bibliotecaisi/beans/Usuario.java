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
 * @author Ambliqui
 */
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    Credenciales credenciales;
    DatosPersonales datosPersonales;

    public Usuario(Credenciales credenciales, DatosPersonales datosPersonales) {
        this.credenciales = credenciales;
        this.datosPersonales = datosPersonales;
    }

    public Credenciales getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(Credenciales credenciales) {
        this.credenciales = credenciales;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.credenciales, other.credenciales)) {
            return false;
        }
        if (!Objects.equals(this.datosPersonales, other.datosPersonales)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "credenciales=" + credenciales + ", datosPersonales=" + datosPersonales + '}';
    }
}
