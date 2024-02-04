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
public class EjercicioArrayAmp5 {

    /**
     * @param args the command line arguments
     */
    //Leer 7 letras sobre un vector. Visualiza cuántas vocales hay.
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] array = new String[7];
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = teclado.nextLine();

        }
        for (int i = 0; i < array.length; i++) {
            char caracterActual = array[i].charAt(0);

            if (caracterActual == 'a') {
                contador++;
            } if (caracterActual == 'e') {
                contador++;
            } if (caracterActual == 'i') {
                contador++;
            } if (caracterActual == 'o') {
                contador++;
            } if (caracterActual == 'u') {
                contador++;
            }
        }
        System.out.println(contador);

    }

}
