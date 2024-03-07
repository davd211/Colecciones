/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Multimedia;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class mainMultimedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Indica que dispositivo deseas crear película (p) o disco (d) :");
        char tipo = teclado.nextLine().charAt(0);
        String titulo = teclado.nextLine();
        String autor = teclado.nextLine();
        String formato = teclado.nextLine();
        Formato taudio;

        if (formato.equals("wav")) {
            taudio = Formato.wav;

        } else if (formato.equals("mp3")) {
            taudio = Formato.mp3;

        } else if (formato.equals("mp4")) {

            taudio = Formato.mp4;

        }
        int duracion = teclado.nextInt();

        switch (tipo) {
            case 'p':

                break;
            case 'd':

                break;
        }

    }

}
