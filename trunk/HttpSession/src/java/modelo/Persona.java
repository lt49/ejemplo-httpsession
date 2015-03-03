/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Emmanuelsg
 */
public class Persona {
    
    private int idpersona;
    private String nombre;
    private String apellidopt;
    private String apellidomt;
    private int dni;
    private int edad;

    public Persona() {
        this.idpersona = 0;
    }

    public Persona(int idpersona, String nombre, String apellidopt, String apellidomt, int dni, String direccion, int edad) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellidopt = apellidopt;
        this.apellidomt = apellidomt;
        this.dni = dni;
        this.edad = edad;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopt() {
        return apellidopt;
    }

    public void setApellidopt(String apellidopt) {
        this.apellidopt = apellidopt;
    }

    public String getApellidomt() {
        return apellidomt;
    }

    public void setApellidomt(String apellidomt) {
        this.apellidomt = apellidomt;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
