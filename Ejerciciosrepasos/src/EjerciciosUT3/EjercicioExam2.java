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
public class EjercicioExam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Scanner teclado = new Scanner(System.in);
        double[] array = new double[5];
        
        for (int i = 0; i < array.length; i++) {
        array[i]=teclado.nextDouble();
        }
        
        
        double masbajo = array[0];
        for (int i = 0; i < array.length; i++) {
            if (masbajo>array[i]) {
                masbajo=array[i];
                
                
            }
            
        }
        System.out.printf("El cliente mas bajo es %.2f",masbajo);
        //altura media 
        
        double resultadomedia=0;
        
       resultadomedia = (array[0]+array[1]+array[2]+array[3]+array[4])/5;
        System.out.printf("La altura media es %.2f",resultadomedia);
        ///////////////////////////////////////////////////////////////////
        
        double medio=0;
        for (int i = 0; i < array.length; i++) {
            medio=medio+array[i];
        }
        medio=medio/array.length;
        System.out.printf("La altura media es %.2f",medio);

    }

}
