/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericio3;

/**
 *
 * @author David.P
 */
public class Persona {
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String dni;

    public Persona(String nombre, String apellido1, String apellido2, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni + '}';
    }
           
    
    
}

class madre extends Persona{

    public madre(String nombre, String apellido1, String apellido2, String dni) {
        super(nombre, apellido1, apellido2, dni);
    }


}

class padre extends Persona{

    public padre(String nombre, String apellido1, String apellido2, String dni) {
        super(nombre, apellido1, apellido2, dni);
    }


}