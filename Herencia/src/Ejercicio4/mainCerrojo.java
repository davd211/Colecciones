/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class mainCerrojo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);

Cerrojo miCerrojo = new Cerrojo(teclado.nextLine());

miCerrojo.abrir(teclado.nextLine());//abrir

miCerrojo.abrir(teclado.nextLine());//abrir


    }
    
}
