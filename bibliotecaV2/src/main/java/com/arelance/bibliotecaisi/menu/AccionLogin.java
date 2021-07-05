/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.menu;

import com.arelance.bibliotecaisi.beans.DatosLogin;
import com.arelance.bibliotecaisi.vista.Vista;


/**
 *
 * @author Mefisto
 */
public class AccionLogin implements AccionUsuario{

    private DatosLogin login;
    
    public AccionLogin() {
    }
    
    private DatosLogin devolverLogin(){
        return new Vista().getDataLogin();
    }
    
    @Override
    public void ejecutar(){
        devolverLogin();
        System.out.println("Hago el login");
    }
}
