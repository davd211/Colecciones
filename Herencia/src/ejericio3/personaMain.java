/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericio3;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class personaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        Persona p1 = new Persona( teclado.nextLine(),teclado.nextLine(),teclado.nextLine(),teclado.nextLine());
        
        
        System.out.print("Datos: ");  System.out.println(p1.toString());
   
        Persona p2 = new Persona( teclado.nextLine(),teclado.nextLine(),teclado.nextLine(),teclado.nextLine());
        
        p1.setMadre(p2);
        
        System.out.print("Madre: "); System.out.print(p2.getNombre()+" "); System.out.print(p2.getApellido1()+" ");System.out.print(p2.getApellido2());
      
        System.out.println("");
        System.out.println(p1.toString());
    }
    
}
