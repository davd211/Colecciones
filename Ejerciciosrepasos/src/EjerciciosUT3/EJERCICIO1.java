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
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     * Algoritmo que realice la suma, resta y el producto de dos números introducidos por teclado


     */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

int resultadosuma, resultadoresta,resultadomulti;


    Scanner teclado = new Scanner(System.in);

         int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        
        resultadosuma = num1 + num2;
        resultadoresta = num1 - num2;
        resultadomulti = num1 * num2;
         
        System.out.print(resultadosuma+ ""+  resultadoresta+ ""+ resultadomulti  );
       

    }
    
}
