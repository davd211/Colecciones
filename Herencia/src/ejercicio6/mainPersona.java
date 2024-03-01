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
            
            Persona p1 = new Persona(3);
            int a = Integer.parseInt(p1.lee());
            p1.divide(3, 0);
           
        } catch (edadexception e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException n) {
            System.out.println(n.getMessage());
        }catch (ArithmeticException a){
            System.out.println(a.getMessage());
        }
        try {
                    Persona p = new Persona(-2);
       } catch (edadexception e) {
            System.out.println("Error "+e.getMessage());}

    }
}
