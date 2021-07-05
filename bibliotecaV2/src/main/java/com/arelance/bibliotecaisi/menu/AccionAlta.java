/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.menu;

import com.arelance.bibliotecaisi.beans.Usuario;
import com.arelance.bibliotecaisi.vista.Vista;


/**
 *
 * @author Mefisto
 */
public class AccionAlta implements AccionUsuario {

    private Usuario usuario;

    public AccionAlta() {
    }
    
    private Usuario devolvolverUsuario(){
        return new Vista().getDataUser();
    }
    
    @Override
    public void ejecutar(){
        devolvolverUsuario();
        System.out.println("Alta de usuario");
    }
}
