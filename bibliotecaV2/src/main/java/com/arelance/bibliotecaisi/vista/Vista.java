/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.vista;

import com.arelance.bibliotecaisi.menu.Menu;
import com.arelance.bibliotecaisi.menu.Opcion;
import com.arelance.bibliotecaisi.beans.DatosLogin;
import com.arelance.bibliotecaisi.beans.Libro;
import com.arelance.bibliotecaisi.beans.Usuario;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Ambliqui
 */
public class Vista {

//    Locale locale = Locale.getDefault();
    Locale locale = Locale.US;
    ResourceBundle msg = ResourceBundle.getBundle("Bundle", locale);

    public Usuario getDataUser() {

        String nombre;
        String apellido;

        System.out.println(msg.getString("socio.nombre"));
        nombre = new Scanner(System.in).nextLine();
        System.out.println(msg.getString("socio.apellido"));
        apellido = new Scanner(System.in).nextLine();

        Usuario usuario = new Usuario(nombre, apellido);
        return usuario;
    }

    public DatosLogin getDataLogin() {
        String nick;
        String password;

        System.out.println(msg.getString("socio.nick"));
        nick = new Scanner(System.in).nextLine();
        System.out.println(msg.getString("socio.password"));
        password = new Scanner(System.in).nextLine();

        DatosLogin loginData = new DatosLogin(nick, password);
        return loginData;
    }

    public Libro recogerLibro() {

        String titulo;
        String ISBN;

        System.out.println(msg.getString("libro.titulo"));
        titulo = new Scanner(System.in).nextLine();
        System.out.println(msg.getString("libro.ISBN"));
        ISBN = new Scanner(System.in).nextLine();
        Libro libro = new Libro(titulo, ISBN);
        return libro;
    }

    public void imprimirMenu(Menu menu) {

        menu.getOpciones().keySet().forEach(clave -> {
            System.out.println(clave + ".- " + menu.getOpciones().get(clave).getLabel());
        });
    }

    public void imprimirLibro(Set<Libro> libreria) {
        System.out.println("Estos son nuestros ejemplares:");
        Iterator iterador = libreria.iterator();
        libreria.forEach(next -> {
            System.out.println("\nISBN: " + next.getISBN());
            System.out.println("Libro: " + next.getTitulo());
        });
    }

    public void elegirOpcion(Menu menu) {
        Map<Integer, Opcion> opciones = menu.getOpciones();
        int opcion = -1;
        opcion = new Scanner(System.in).nextInt();
        opciones.get(opcion).getAccion().ejecutar();
    }

    public static void main(String[] args) {

        Vista vista = new Vista();
        vista.getDataUser();
    }
}
