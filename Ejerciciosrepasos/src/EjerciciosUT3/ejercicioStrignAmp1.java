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
public class ejercicioStrignAmp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
      int contador4=0;
      int op=0;

        String frase = new String(teclado.nextLine());

        for (int i = 0; i < frase.length(); i++) {
          if (frase.charAt(i)== ' '){
              
              if (i-op==4) {
                  contador4++;
                  
              }
              
              op=i+1;
              
        }
            
          
        }
        System.out.println(contador4);
    }

}


