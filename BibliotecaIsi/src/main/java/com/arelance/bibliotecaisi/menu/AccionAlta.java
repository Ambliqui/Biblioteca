/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.menu;

import com.arelance.bibliotecaisi.beans.Usuario;

/**
 *
 * @author Mefisto
 */
public class AccionAlta implements AccionUsuario {

    private Usuario usuario;

    public AccionAlta() {
    }
    
    public AccionAlta(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Override
    public void ejecutar(){
        System.out.println("Alta de usuario");
    }
}
