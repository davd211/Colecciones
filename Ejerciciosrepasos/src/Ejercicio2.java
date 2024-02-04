
import static java.lang.Math.PI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author David.P
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * Realiza un programa que calcule el área de una circunferencia de radio 5,2 centímetros.
     */
    public static void main(String[] args) {

        double radio = 5.2;
        double resultado;
        
        
        resultado = PI * (radio*radio);

        System.out.println("El area de la circunferenca de radio 5.2 m es: "+resultado);

    }
    
}
