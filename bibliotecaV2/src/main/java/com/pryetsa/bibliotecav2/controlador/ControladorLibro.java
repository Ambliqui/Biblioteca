/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.bibliotecav2.controlador;

import com.arelance.bibliotecaisi.beans.Libro;
import com.arelance.bibliotecaisi.beans.Sesion;
import com.pryetsa.bibliotecav2.datosFichero.PersistenciaLibro;
import com.pryetsa.bibliotecav2.logica.Logica;
import com.pryetsa.bibliotecav2.servicios.ServiciosLibro;
import com.pryetsa.bibliotecav2.servicios.ServiciosSesion;
import com.arelance.bibliotecaisi.vista.VistaAntonio;

/**
 *
 * @author pryet
 */
public class ControladorLibro {

    private Sesion sesion;
    private final PersistenciaLibro pLibro;
    private VistaAntonio vista;
    private Logica log;
    private final ServiciosLibro sLibro;
    private final ServiciosSesion sSesion;

    public ControladorLibro(Sesion sesion, PersistenciaLibro pLibro, VistaAntonio vista, Logica log, ServiciosLibro sLibro,ServiciosSesion sSesion) {
        this.sesion = sesion;
        this.pLibro = pLibro;
        this.vista = vista;
        this.log = log;
        this.sLibro = sLibro;
        this.sSesion=sSesion;
    }

    public void alquilarLibro() {
        if (log.espacioAlquiler(sesion)) {//tiene espacio para alquilar
            //vista.mostrarLibros para alquilar
            vista.mostrarLibrosAlquilables(sLibro.librosAlquilables(sesion, pLibro.getRegistroLibros().keySet()));
            
            Libro libro = vista.pideLibro();
            if (log.libroNoRepetido(sesion, libro)&&sLibro.alquilar(sesion.getUsuario(), libro)) {
                //actualizas la sesion
                sesion=sSesion.actualizarSesion(sesion.getUsuario());
                System.out.println("Libro añadido");
            }else{
                System.out.println("Ya tienes este libro");
            }
            //redirigir al menu alquilar-devolver-logout
        }else{
            //no tienes espacio para alquilar
            System.out.println("No tienes espacio para alquilar");
        }
        
        //redirigir al menu alquilar-devolver-logout

    }

    public void devolverLibro() {
        if (!sesion.getLibros().isEmpty()) {
            vista.mostrarLibrosDevolver(sesion.getLibros());
            Libro libro = vista.pideLibro();
            sLibro.devolverLibro(sesion.getUsuario(), libro);
            sesion=sSesion.actualizarSesion(sesion.getUsuario());
            System.out.println("Libro devuelto");
        } else {
            System.out.println("No tienes libros");
            //no tienes libros
        }

    }
}
