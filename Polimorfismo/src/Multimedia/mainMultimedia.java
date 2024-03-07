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

        Multimedia m1 = null;
        System.out.println("Indica que dispositivo deseas crear película (p) o disco (d) :");
        char tipo = teclado.nextLine().charAt(0);
        String titulo = teclado.nextLine();
        String autor = teclado.nextLine();
        
        switch (tipo) {
            case 'p':
//m1 = new Pelicula(titulo, autor, formato, tipo, autor, autor)
                break;
              case 'd':
                
                break;
        }

    }

}
