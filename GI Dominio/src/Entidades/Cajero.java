/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Aldeco
 */
@Entity
@Table (name = "cajeros")
public class Cajero extends Usuario implements Serializable{
    

    public Cajero() {
        super();
    }

    public Cajero(int idUsuario, String nombre, String nickname, String contrasena) {
        super(idUsuario, nombre, nickname, contrasena);
    }

    public Cajero(String nombre, String nickname, String contrasena) {
        super(nombre, nickname, contrasena);
    }
    
}