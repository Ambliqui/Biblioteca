/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.bibliotecav2.controlador;

import com.arelance.bibliotecaisi.vista.*;
import com.arelance.bibliotecaisi.beans.*;
import com.pryetsa.bibliotecav2.excepciones.*;
import com.pryetsa.bibliotecav2.logica.*;
import com.pryetsa.bibliotecav2.servicios.*;

/**
 *
 * @author pryet
 */
public class ControladorLogin {

    private final Logica log;
    private final ServiciosSesion sSesion;
    private final VistaAntonio vista;
    private Sesion sesion;
    private final int MAX_INTENTOS = 3;
    private int contador = MAX_INTENTOS - 1;

    public ControladorLogin(Logica log, ServiciosSesion sSesion, VistaAntonio vista) {
        this.log = log;
        this.sSesion = sSesion;
        this.vista = vista;
    }

    
    public void login() throws LimiteDeIntentosSuperadoException {

        if (contador >= 0) {
            DatosLogin datosLogin = vista.pideDatosLogin();
            try {
                Usuario usuario = log.validarUsuario(datosLogin);

                sesion = sSesion.login(usuario);
                //CAI cambiar a internacionalizacion
                System.out.println("Login corecto");
                //return sesion;
                //redirigir al menu de alquileres
                return;
            } catch (NickIncorrectoException e) {
                vista.nickIncorrecto(contador);

            } catch (PassIncorrectoException e) {
                vista.passIncorrecto(contador);
            }
            contador--;

            //redirigir al menu principal
        }

        if (contador < 0) {
            //CAI cambiar a internacionalizacion
            throw new LimiteDeIntentosSuperadoException("Limite de intentos superado");
        }
        //login();
        //return login();
        //return null;
    }
    
    
    public void logOut(){
        sesion=sSesion.logOut(sesion);
        //CAI cambiar a internacionalizacion
         System.out.println("Deslogueado");
        //guardar en archivo
        //redirigir al menu principal
    }

    public Sesion getSesion() {
        return sesion;
    }
    
}
