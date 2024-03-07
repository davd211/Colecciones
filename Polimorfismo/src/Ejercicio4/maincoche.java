/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David.P
 */
public class maincoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);

            coche c1 = null;
            String matricula = teclado.nextLine();
            System.out.println("Cambio automático (a) o cambio manual (m)");
            char tipo = teclado.nextLine().charAt(0);

            switch (tipo) {
                case 'a':
                    c1 = new CocheCambioAutomatico(matricula);
                    
                    
                    break;
                case 'm':
                    c1 = new CocheCambioManual(matricula);
                    
                    
                    break;
            }
        } catch (velocidadexception ex) {
            Logger.getLogger(maincoche.class.getName()).log(Level.SEVERE, null, ex);
        } catch (marchaexception ex) {
            Logger.getLogger(maincoche.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
