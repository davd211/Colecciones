
package Ejercicio1;

import java.util.Scanner;


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
