/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author David.P
 */
public class mainPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws edadexception {

          try {
            Persona p1 = new Persona(-2); // Lanza una EdadNegativaException
            int edad = Integer.parseInt(p1.lee());
            int resultado = p1.divide(3, 0); // Lanza una ArithmeticException
            System.out.println("Edad: " + edad);
            System.out.println("Resultado: " + resultado);
        }  catch (ArithmeticException e) {
            System.err.println("No se puede dividir por 0");
        }
    }
}
