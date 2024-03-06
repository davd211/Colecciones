/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class mainVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        vehiculo c1=null;
//identificar al coche o camion
        System.out.println("Qué deseas crear coche(co) o camión (ca)");
        String id = teclado.nextLine();
        switch (id) {
            case "ca":
                if (c1 instanceof Camion) {
                    
                
                 c1 = new Camion();
                c1.setMatricula(teclado.nextLine());
                c1.setKm(teclado.nextInt());
                c1.setAñomatriculacion(teclado.nextInt());
                teclado.nextInt();//tengo que poner el tonelaje y la altura 
               ((Camion) c1).calculaVidaUtil();
                }
                break;
            case "co":
                if (c1 instanceof Coche)  {
                    
                }
                 c1 = new Coche();

                c1.setMatricula(teclado.nextLine());
                c1.setKm(teclado.nextInt());
                c1.setAñomatriculacion(teclado.nextInt());
                ((Coche) c1).setNumeroPuertas(teclado.nextInt());
                c1.calculaVidaUtil();
                String tipo = ((Coche) c1).tipoVehiculo();
                System.out.println("Tipo coche  " + tipo);
                break;

        }

    }
}
