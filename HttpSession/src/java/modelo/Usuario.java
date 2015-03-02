/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Luis alberto
 */
public class Usuario {
    
    private String usuario;
    private String NombreCompleto;
    private String Password;

    public Usuario(String usuario, String NombreCompleto, String Password) {
        this.usuario = usuario;
        this.NombreCompleto = NombreCompleto;
        this.Password = Password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
       
    
}
