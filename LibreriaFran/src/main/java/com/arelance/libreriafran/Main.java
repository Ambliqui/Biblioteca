/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafran;

import com.arelance.libreriafran.modelo.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import com.arelance.libreriafran.controlador.*;
import java.util.List;
import java.util.function.BiConsumer;

/**
 *
 * @author frans
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Escribir escribiendo = new Escribir();
        Leer leyendo = new Leer();
        
        escribiendo.execute(); // sobreescribe
        leyendo.execute(); // lee siempre el mismo archivo
        
    }
}
