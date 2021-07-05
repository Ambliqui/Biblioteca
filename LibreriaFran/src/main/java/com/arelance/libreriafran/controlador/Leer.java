/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafran.controlador;

import com.arelance.libreriafran.modelo.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author frans
 */
public class Leer implements CommandFile{
    
    
    
    @Override
    public void execute() {
        try (FileInputStream lectura = new FileInputStream("biblioteca.bin"); ObjectInputStream ois = new ObjectInputStream(lectura)) {
            Usuario aux = (Usuario) ois.readObject();
            aux.getUsuarios();
            System.out.println(aux);            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
