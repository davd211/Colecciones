/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosUT3;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class Ejercicio2AmpliString {

    /**
     * @param args the command line arguments
     *///Solicitar una palabra por teclado (si incluye espacios eliminarlos) 
    //Y mostrar la palabra y su linvertida (efecto espejo) Por ejemplo si la palabra es "amiga", la cadena espejo sería "amigaagima"
  public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena = teclado.nextLine();
       cadena= cadena.replace(" ", "");

        // Obtenemos la cadena inversa
        String cadenaInversa = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInversa = cadenaInversa + cadena.charAt(i);
        }

        // Imprimimos la cadena y su inversa
       System.out.println("Cadena espejo: "+cadena+cadenaInversa);
    }
}