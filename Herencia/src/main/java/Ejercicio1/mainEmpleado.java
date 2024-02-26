/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class mainEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Qué tipo de empleado desea crear Administrativo(a) o Programador (p) ");

      char  tipoEmpleado = teclado.nextLine().charAt(0);
                
      if (tipoEmpleado == 'a'){
      
          System.out.println("hola a");
      }else{
      
          System.out.println("no hola a");
      }

    }
    
}
