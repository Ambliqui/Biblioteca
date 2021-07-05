/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pryetsa.bibliotecav2.datosFichero;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author frans
 */
public class Escribir implements CommandFile {

    private Map datos = new HashMap<>();

    public Escribir( Map datos) {
        this.datos=datos;
    }
    
    @Override
    public void execute() {
        try (FileOutputStream escritura = new FileOutputStream("biblioteca.bin");
                ObjectOutputStream oos = new ObjectOutputStream(escritura)) {
            oos.writeObject(datos);
            
            // esto es un ejemplo donde tendremos que introducir los usuarios de verdad
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Escribir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Escribir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
