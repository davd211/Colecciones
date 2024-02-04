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
public class EjercicioExam3 {

    /**
     * @param args the command line arguments
     */
    //introducir sueldo de 3 empleados
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double sueldos[][] = new double[3][2];

        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                sueldos[i][j]= teclado.nextDouble();
                
            }
            
        }
      
       
    }

}
