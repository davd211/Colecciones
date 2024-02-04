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
public class EjercicioExamen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero1 = teclado.nextInt(), numero2 = teclado.nextInt();
        teclado.nextLine();
        int resultado = 0;

        char ope = teclado.nextLine().charAt(0);
        //esto es para que en la entrada que coge la 
        //linea le estamos diciendo con el charat que coga el valor
        //de la posicion 0

        switch (ope) {
            case '*':
                resultado = 1;
                for (int i = numero1; i < numero2; i++) {

                    if (i % 2 == 0) {
                        resultado = resultado * i;

                    }

                }

                break;
            case '+':
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 0) {
                        resultado = resultado + i;
                    }

                }

                break;

        }
     


    }

}
