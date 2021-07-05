/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafran.controlador;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.arelance.libreriafran.modelo.Credenciales;
import com.arelance.libreriafran.modelo.DatosPersonales;
import com.arelance.libreriafran.modelo.Usuario;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author frans
 */
public class Escribir implements CommandFile {

    Scanner teclado = new Scanner(System.in);
    Usuario users = new Usuario();
    Map<Credenciales, DatosPersonales> usuarios = new HashMap<>();
    Credenciales x = new Credenciales(teclado.next(), teclado.next());
    DatosPersonales y = new DatosPersonales(teclado.next(), teclado.next());

    @Override
    public void execute() {
        try (FileOutputStream escritura = new FileOutputStream("biblioteca.bin"); ObjectOutputStream oos = new ObjectOutputStream(escritura)) {

            usuarios.put(x, y);
            users.setUsuarios(usuarios);
            oos.writeObject(users);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Escribir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Escribir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
