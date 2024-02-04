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
public class ejericico2 {

    /**
     * @param args the command line arguments
     * Leer 5 notas numéricas y visualizar cuántos suspensos y aprobados hay


     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int aprobados = 0, suspensos = 0;
        
        
        for (int i = 0; i < 5; i++) {
            int num1 = teclado.nextInt();
            
            if (num1 <= 5) {
                aprobados++;
                
                
            }else {
            
            suspensos++;
            }
            
        }
        System.out.println("Aprobados "+aprobados+ " Suspensos "+suspensos);
        
        
        }
    
}
