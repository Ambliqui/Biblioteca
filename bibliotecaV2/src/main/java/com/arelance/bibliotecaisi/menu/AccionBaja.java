/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.menu;

/**
 *
 * @author Mefisto
 */
public class AccionBaja implements AccionUsuario {

    public AccionBaja() {
    }
    
    @Override
    public void ejecutar(){
        System.out.println("Doy la baja");
    }
}
