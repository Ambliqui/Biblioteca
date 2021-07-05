/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.vista;

import com.arelance.bibliotecaisi.beans.DatosLogin;
import com.arelance.bibliotecaisi.beans.Libro;
import com.arelance.bibliotecaisi.beans.Sesion;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;



/**
 *
 * @author pryet
 */
public class VistaAntonio {
    
    public Libro pideLibro(){
        return new Libro("El quijote", "000");
    }
    public DatosLogin pideDatosLogin(){
        return new DatosLogin("1234", "q");
    }
    public void nickIncorrecto(int contador){
        System.out.println("nick incorrecto " + contador + " intentos restantes");
    }
    public void passIncorrecto(int contador){
        System.out.println("pass incorrecto " + contador + " intentos restantes");
    }
    public void mostrarLibrosAlquilables(Set<Libro> lista){
        System.out.println(lista);
    }
    
    public void mostrarLibrosDevolver(Set<Libro> lista){
        System.out.println(lista);
    }
}
