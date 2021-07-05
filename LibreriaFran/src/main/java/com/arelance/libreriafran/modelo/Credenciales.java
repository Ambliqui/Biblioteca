/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.libreriafran.modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Credenciales implements Comparable<Credenciales>, Serializable{
    private static final long serialVersionUID = 1L;
    private String nick;
    private String pw;

    public Credenciales(String nick, String pw) {
        this.nick = nick;
        this.pw = pw;
    }

    public Credenciales() {
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nick);
        hash = 83 * hash + Objects.hashCode(this.pw);
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
        final Credenciales other = (Credenciales) obj;
        if (!Objects.equals(this.nick, other.nick)) {
            return false;
        }
        return Objects.equals(this.pw, other.pw);
    }
    

    @Override
    public String toString() {
        return "Credenciales{" + "nick=" + nick + ", pw=" + pw + '}';
    }

    @Override
    public int compareTo(Credenciales o) {
        return nick.compareTo(o.nick);
    }
    
    
}
