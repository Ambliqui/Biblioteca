/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.bibliotecav2.logica;

import com.arelance.bibliotecaisi.beans.DatosLogin;
import com.arelance.bibliotecaisi.beans.Libro;
import com.arelance.bibliotecaisi.beans.Sesion;
import com.arelance.bibliotecaisi.beans.Usuario;
import com.pryetsa.bibliotecav2.datosFichero.PersistenciaUsuario;
import com.pryetsa.bibliotecav2.excepciones.NickIncorrectoException;
import com.pryetsa.bibliotecav2.excepciones.PassIncorrectoException;
import java.util.Map;




/**
 *
 * @author pryet
 */
public class Logica {
 
    private PersistenciaUsuario pUsuario;
    private final int MAX_LIBROS=3;
    public Logica(PersistenciaUsuario pUsuario) {
        this.pUsuario = pUsuario;
    }
    
    public Usuario validarUsuario(DatosLogin datosLogin) throws PassIncorrectoException, NickIncorrectoException{
        
        for (Map.Entry<DatosLogin,Usuario> entry : pUsuario.getRegistroUsuarios().entrySet()) {
            if(datosLogin.equals(entry.getKey()))//mismo nick
            {
                if(datosLogin.getPassword().equalsIgnoreCase(entry.getKey().getPassword()))//mismo pass
                {
                    return entry.getValue();//me decuelve el usuario
                }
                    //pass diferente excepcion
                    
                    throw new PassIncorrectoException("La contraseña es incorrecta");
                    
            }
            
         }
        //nick diferente excepcion
           
            throw new NickIncorrectoException("El nick es incorrecto");
       
    }   
        
    public boolean espacioAlquiler(Sesion sesion){
        return sesion.getLibros().size()<MAX_LIBROS;
    }
    public boolean libroNoRepetido(Sesion sesion,Libro libro){
        return !sesion.getLibros().contains(libro);
    }
    
}
