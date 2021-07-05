/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.bibliotecav2;

import com.arelance.bibliotecaisi.vista.VistaAntonio;
import com.arelance.bibliotecaisi.beans.DatosLogin;
import com.arelance.bibliotecaisi.beans.Usuario;
import com.arelance.bibliotecaisi.beans.Libro;
import com.pryetsa.bibliotecav2.controlador.*;
import com.pryetsa.bibliotecav2.datosFichero.*;
import com.pryetsa.bibliotecav2.excepciones.*;
import com.pryetsa.bibliotecav2.logica.Logica;
import com.pryetsa.bibliotecav2.servicios.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author pryet
 */
public class Main {
    
   
    public static void main(String[] args) {
        
        //try Abrir el archivo
        PersistenciaLibro pLibro=new PersistenciaLibro(new HashMap<Libro,Set<Usuario>>());

        PersistenciaUsuario pUsuario=new PersistenciaUsuario(new HashMap<DatosLogin, Usuario>());
        Libro elQuijote=new Libro("El quijote", "000");
        Libro elQuijote2=new Libro("El quijote2", "002");
        Libro elQuijote3=new Libro("El quijote3", "003");
        Libro elQuijote4=new Libro("El quijote4", "004");
        pLibro.getRegistroLibros().put(elQuijote, new HashSet<Usuario>());
        pLibro.getRegistroLibros().put(elQuijote2, new HashSet<Usuario>());
        pLibro.getRegistroLibros().put(elQuijote3, new HashSet<Usuario>());
        pLibro.getRegistroLibros().put(elQuijote4, new HashSet<Usuario>());

        Set<Usuario> listUser=new HashSet<>();
        Usuario paco=new Usuario("Paco", "Sanchez");
       //lista.add(paco);
        
//        Map<Libro,List<Usuario>> mapa=new HashMap<>();
//        mapa.put(elQuijote, listUser);
        pLibro.getRegistroLibros().put(elQuijote, listUser);
        pUsuario.getRegistroUsuarios().put(new DatosLogin("1234", "q"), paco);
        
        ControladorLogin cl=new ControladorLogin(new Logica(pUsuario), new ServiciosSesion(pLibro), new VistaAntonio());
    
        try {
            cl.login();
        } catch (LimiteDeIntentosSuperadoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
       ControladorLibro cLib=new ControladorLibro(cl.getSesion(), pLibro, new VistaAntonio(), new Logica(pUsuario), new ServiciosLibro(pLibro),new ServiciosSesion(pLibro));
       cLib.alquilarLibro();
       cLib.devolverLibro();
       cLib.alquilarLibro();
       cLib.alquilarLibro();
       cLib.devolverLibro();
       cLib.devolverLibro();
       cLib.alquilarLibro();
       cLib.alquilarLibro();
       cl.logOut();
    //finally cerrar el archivo
    }
}
