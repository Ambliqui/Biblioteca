/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi;

import com.arelance.bibliotecaisi.menu.*;
import com.arelance.bibliotecaisi.menu.vista.Vista;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Mefisto
 */
public class Main {

    public static void main(String[] args) {
        
        Map <Integer, Opcion> opciones = new LinkedHashMap<>();
        Vista vista = new Vista();
        
        opciones.put(1, new Opcion("Login", new AccionLogin()));
        opciones.put(2, new Opcion("Alta", new AccionAlta()));
        opciones.put(3, new Opcion("Salir", new AccionSalirBiblioteca()));
        opciones.put(4, new Opcion("Alta Libro", new AccionAltaLibro()));
        Menu menuPrincipal = new Menu(opciones);

        vista.imprimirMenu(menuPrincipal);
        vista.elegirOpcion(menuPrincipal);
    }
}
