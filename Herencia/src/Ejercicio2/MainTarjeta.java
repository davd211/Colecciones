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
public class MainTarjeta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //System.out.println("Introduzca el PIN de la tarjeta SIM:");
        String pin = teclado.nextLine();

       // System.out.println("Introduzca el PUK de la tarjeta SIM:");
        String puk = teclado.nextLine();

        Tarjeta miSim = new Tarjeta(pin, puk);

        //encender lo intentamos 3 veces
        System.out.println(miSim.encender(teclado.nextLine()));
        System.out.println(miSim.encender(teclado.nextLine()));
        System.out.println(miSim.encender(teclado.nextLine()));

        // Estado
        System.out.println("Estado de la SIM: " + miSim.getEstado());
        //comprobar si se puede encender con la siguiente entrada

        if (miSim.encender(teclado.nextLine())) {

            System.out.println("Se ha encendido");
        } else {
            System.out.println("No se ha encendido");
        }
        //mostrar el estado 
        System.out.println("Estado de la SIM: " + miSim.getEstado());

        //Desbloquear
       miSim.desbloquear(teclado.nextLine());

        miSim.apagar();

        System.out.println("Estado de la SIM: " + miSim.getEstado());

        miSim.desbloquear(teclado.nextLine());
        System.out.println("Estado de la SIM: " + miSim.getEstado());
        miSim.apagar();
        System.out.println("Estado de la SIM: " + miSim.getEstado());

    }
}
