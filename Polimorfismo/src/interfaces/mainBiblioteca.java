/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class mainBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Biblioteca b1 = null;
        System.out.println("Quieres crear un libro (l) o una revista (r)");

        int codigo = teclado.nextInt();
        teclado.next();
        String titulo = teclado.nextLine();

        int año = teclado.nextInt();
        teclado.next();

       
        switch (teclado.nextLine().charAt(0)) {
            case 'l'://hayque poner los teclado del constructor fuera y pedirlo por variables porque hay que limpiar el buffer entre un entero y una linea 
                if (b1 instanceof Libro) {

                    b1 = new Libro(codigo,titulo,año);
//                    switch (teclado.nextLine().charAt(0)) {
//                        case 's':
//                            ((Libro) b1).setPrestado(true);
//                            break;
//                        case 'n':
//                            ((Libro) b1).setPrestado(false);
//
//                            break;
//                    }
                    break;

                }

        }

    }
}
