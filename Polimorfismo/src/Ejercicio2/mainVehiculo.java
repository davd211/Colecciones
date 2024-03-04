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

//identificar al coche o camion
        System.out.println("Qué deseas crear coche(co) o camión (ca)");
        String id = teclado.nextLine();
        switch (id) {
            case "ca":
                Camion c1 = new Camion();
                c1.setMatricula(teclado.nextLine());
                c1.setKm(teclado.nextInt());
                c1.setAñomatriculacion(teclado.nextInt());
                c1.setNumeroPuertas(teclado.nextInt());
                c1.calculaVidaUtil();

                break;
            case "co":
                Coche c2 = new Coche();

                c2.setMatricula(teclado.nextLine());
                c2.setKm(teclado.nextInt());
                c2.setAñomatriculacion(teclado.nextInt());
                c2.calculaVidaUtil();
                String tipo = c2.tipoVehiculo(teclado.nextInt());
                System.out.println("Tipo coche  " + tipo);
                break;

        }

    }
}
