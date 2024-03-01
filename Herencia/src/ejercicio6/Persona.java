/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class Persona {

    protected int edad;

    public Persona(int edad) throws edadexception {
        if (edad < 0) {
            throw new edadexception("Edad no permitida");
        }

        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws edadexception {
        if (edad < 0) {
            throw new edadexception("Edad no permitida");
        }

        this.edad = edad;
    }

    public String lee() {
        Scanner teclado = new Scanner(System.in);

        return teclado.nextLine();
    }

    public int divide(int a, int b) throws edadexception {
   if (b < 0) {
            throw new edadexception("Edad no permitida");
        }
        return a / b;

    }

    public Persona() {
    }

}

class edadexception extends Exception {

    public edadexception() {
    }

    public edadexception(String message) {
        super(message);
    }

}
