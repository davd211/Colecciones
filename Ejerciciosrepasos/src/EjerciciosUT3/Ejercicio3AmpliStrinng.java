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
public class Ejercicio3AmpliStrinng {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cadena introducida por el usuario
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        // Encontrar la posición del primer espacio
        int espacio = cadena.indexOf(" ");

        // Si la cadena tiene una sola palabra, devolverla directamente
        if (espacio == -1) {
            System.out.println(cadena);
            return;
        }

        // Obtener la primera palabra y el resto de la cadena
        String primeraPalabra = cadena.substring(0, espacio);
        String restoCadena = cadena.substring(espacio + 1);

        // Formar la nueva cadena con la primera palabra al final
        String nuevaCadena = restoCadena + " " + primeraPalabra;

        // Imprimir la nueva cadena
        System.out.println(nuevaCadena);
    }
}
