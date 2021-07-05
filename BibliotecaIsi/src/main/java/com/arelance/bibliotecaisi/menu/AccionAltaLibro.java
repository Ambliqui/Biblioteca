/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.menu;

import com.arelance.bibliotecaisi.beans.Libreria;
import com.arelance.bibliotecaisi.beans.Libro;
import com.arelance.bibliotecaisi.menu.vista.Vista;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Mefisto
 */
public class AccionAltaLibro implements AccionUsuario {

    Vista vista = new Vista();

    public AccionAltaLibro() {
    }

    @Override
    public void ejecutar() {
        Set<Libro> libros = new LinkedHashSet<>();
//        libros.add(vista.recogerLibro());
        libros.add(new Libro("La vuelta al mundo en 80 dias", "1"));
        libros.add(new Libro("Dracula", "8420453455"));
        libros.add(new Libro("El retrato de Dorian Gray", "8467032537"));
        libros.add(new Libro("Alicia en el pais de las maravillas", "8471669005"));
        libros.add(new Libro("el sabueso de los Baskerville", "8466724796 "));
        vista.imprimirLibro(libros);

    }

}
