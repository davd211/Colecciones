/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author David.P
 */
public class Persona {

    protected String dni;
    protected String nombre;
    protected int edad;
    protected String direccion;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}

class Profesor extends Persona {

    private String titulacion;
    private int experiencia;

    public int calcularSueldo(int sueldo) {

        return 0;

    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
}

class ProfesorInterino extends Persona {

    public int calcularSueldo(int sueldo) {

        sueldo = 1000;
        int plusinternidad = 200;
        int resultado = sueldo + plusinternidad;

        return resultado;
    }
    

}
class Alumnos extends Persona{


private String cicloMatriculado;
private String curso ;


public double calcularMatricula(){

int numeroDeModulos = 7;
int resultado =numeroDeModulos * 50;
return resultado;

}

    public String getCicloMatriculado() {
        return cicloMatriculado;
    }

    public void setCicloMatriculado(String cicloMatriculado) {
        this.cicloMatriculado = cicloMatriculado;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}