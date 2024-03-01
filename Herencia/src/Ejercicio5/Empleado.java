/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author David.P
 */
public class Empleado {

    protected String nombre;
    protected int edad;
    protected boolean casado;
    protected double salaario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, boolean casado, double salaario) throws EEdadNoValida {
        if (edad < 18) {
            throw new EEdadNoValida("No se puede dar de alta. Edad inferior a 18 años");
        }

        this.nombre = nombre;

        this.edad = edad;
        this.casado = casado;
        this.salaario = salaario;

    }

    public void setEdad(int edad) throws EEdadNoValida {

        if (edad < 18) {
            throw new EEdadNoValida("No se puede dar de alta. Edad inferior a 18 años");
        }

        this.edad = edad;
    }

    public String clasificacionEdad(int edad) {

        if (edad <= 21) {

            return "Principiante";
        } else if (edad >= 22 || edad <= 35) {
            return "Intermedio";
        } else if (edad < 35) {
            return "Senior";
        }
        return "no es una edad valida";
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", casado=" + casado + ", salaario=" + salaario + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalaario() {
        return salaario;
    }

    public void setSalaario(double salaario) {
        this.salaario = salaario;
    }

}

class Programador extends Empleado {

    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador() {
    }

//constructor con parametros del padre e hijo
    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, String nombre, int edad, boolean casado, double salaario) throws EEdadNoValida {
        super(nombre, edad, casado, salaario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public double calcularSalario(int horasExtra) {

        return (1000) + horasExtra * 20;

    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

}

class Administrativo extends Empleado {

    private nivelingles ni;

    public enum nivelingles{
        alto,
        medio,
        bajo
    }

    

    public Administrativo() {
    }

    public Administrativo(nivelingles ni, String nombre, int edad, boolean casado, double salaario) throws EEdadNoValida {
        super(nombre, edad, casado, salaario);
        this.ni = ni;
    }
    
    

    public double calcularSalario(int horasExtra) {

        return (1000) + horasExtra * 20;

    }

    public nivelingles getNi() {
        return ni;
    }

    public void setNi(nivelingles ni) {
        this.ni = ni;
    }

}

class EEdadNoValida extends Exception { //creamos esta clase fura
// de exception una vez cread hacemos los constructores por defecto
// y el constructor de mensaje.    

    public EEdadNoValida() {
    }

    public EEdadNoValida(String message) {//aqui no se escribira el mensaje 
//se escribe en el metodo del padre         
        super(message);
    }

}
