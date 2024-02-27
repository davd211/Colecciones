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
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el PIN de la tarjeta SIM:");
        String pin = sc.nextLine();

        System.out.println("Introduzca el PUK de la tarjeta SIM:");
        String puk = sc.nextLine();

        Tarjeta miSim = new Tarjeta(pin, puk);

        // Encendido
        System.out.println("Encendiendo la tarjeta SIM...");
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduzca el PIN:");
            String pinIntroducido = sc.nextLine();
            boolean encendida = miSim.encender(pinIntroducido);
            System.out.println(encendida ? "Se ha encendido" : "No se ha encendido");
        }

        // Estado
        System.out.println(miSim);

        // Desbloqueo
        System.out.println("Desbloqueando la tarjeta SIM...");
        boolean desbloqueada = miSim.desbloquear(puk);
        System.out.println(desbloqueada ? "Se ha desbloqueado" : "No se ha desbloqueado");

        // Apagar
        System.out.println("Apagando la tarjeta SIM...");
        miSim.apagar();

        // Estado final
        System.out.println(miSim);
    }
}