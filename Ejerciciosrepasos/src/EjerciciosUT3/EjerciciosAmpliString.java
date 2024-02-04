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
public class EjerciciosAmpliString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double plus4 = 0;
        double moins4 = 0;
        int position = 0;

        String frase;

        frase = tec.nextLine() + " ";

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == ' ') {

                if ((i - position) < 4) {

                    moins4++;
                    position = i + 1;

                } else if ((i - position) >= 4) {

                    plus4++;
                    position = i + 1;

                }

            }

        }

        double mediaPlus;
        double mediaMoins;

        mediaPlus = (plus4 / (plus4 + moins4)) * 100.0; //Ça variable me donnera la média des mots de 4 lettres ou plus.
        mediaMoins = (moins4 / (plus4 + moins4)) * 100.0; //Et celle-ci la média de mots de moins de 4 lettres.

        System.out.printf("El porcentaje de palabras con menos de 4 caracteres es: %.2f%%%n", mediaMoins);
        System.out.printf("El porcentaje de palabras con 4 o mas caracteres es: %.2f%%%n", mediaPlus);
    }

}



