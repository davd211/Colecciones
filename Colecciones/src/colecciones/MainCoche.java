/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.ArrayList;

/**
 *
 * @author David.P
 */
public class MainCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Coche c1 = new Coche();
        c1.setVelocidad(30);

        ArrayList<Coche> listaCoche = new ArrayList<Coche>(5);

        
        listaCoche.add(c1);
        

        for (int i = 0; i < 50; i++) {
            Coche c2 = new Coche();
            listaCoche.add(c2);
            
            
        }
        
        
        
        for (Coche renaultClio : listaCoche) {
            System.out.println(renaultClio);
        }

    }

}
