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
public class EjercicioMatrices1 {

    /**
     * @param args the command line arguments
     */
    //Introducir 10 números y almacenarlos en una matriz de 5 por 2. Visualizar solo las filas pares. 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[5][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int[] is = matriz[j];
                matriz[i][j] = teclado.nextInt();
            }
        }
        //Hasta aqui es solo para escribir 

        for (int i = 0; i < matriz.length; i++) {
            if (i % 2 != 0) {
                System.out.print("fila " + i + ": ");
            }
            for (int j = 0; j < matriz[0].length; j++) {
                if (i % 2 != 0) {
                    System.out.print(matriz[i][j] + ",");
                }
            }
        }
        System.out.print(" ");
    }

}
