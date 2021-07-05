/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.menu;

import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author Mefisto
 */
public class Menu implements Serializable {
    
    private static final long serialVersionUID = 1L;
    Map<Integer, Opcion> opciones;

    public Menu(Map<Integer, Opcion> opciones) {
        this.opciones = opciones;
    }

    public Map<Integer, Opcion> getOpciones() {
        return opciones;
    }
}
