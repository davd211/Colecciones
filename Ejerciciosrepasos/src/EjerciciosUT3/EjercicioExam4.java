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
public class EjercicioExam4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String frase = teclado.nextLine();
        int contador1 = 1;

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == ' ') {

                contador1++;
            }

        }
        System.out.println(contador1);

        int contadorPalabras4Letras = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                int letrasEnPalabra = 0;
                while (i < frase.length() && frase.charAt(i) != ' ') {
                    letrasEnPalabra++;
                    i++;
                }
                if (letrasEnPalabra == 4) {
                    contadorPalabras4Letras++;
                }
            }
        }

// Imprimir el resultado
        System.out.println("Palabras de 4 letras: " + contadorPalabras4Letras);
    }
}
