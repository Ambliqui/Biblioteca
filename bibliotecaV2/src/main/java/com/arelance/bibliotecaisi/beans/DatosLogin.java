/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.bibliotecaisi.beans;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author pryet
 */
public class DatosLogin implements Comparable<DatosLogin>, Serializable{
    private static final long serialVersionUID = 1L;
     private final String password;
     private final String nick;

    public DatosLogin(String password, String nick) {
        this.password = password;
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public int hashCode() {
        int hash = 7;//Permite pass repetidos
        hash = 59 * hash + Objects.hashCode(this.nick);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DatosLogin other = (DatosLogin) obj;
        if (!Objects.equals(this.nick, other.nick)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(DatosLogin o) {
        return nick.compareTo(o.nick);
    }
    
}
