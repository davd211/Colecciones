/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class maincoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        coche c1 = null;
        String matricula = teclado.nextLine();
        System.out.println("Cambio automático (a) o cambio manual (m)");
        char tipo = teclado.nextLine().charAt(0);

        switch (tipo) {
            case 'a':
                c1 = new CocheCambioAutomatico(matricula);
                if (c1 instanceof CocheCambioAutomatico) {

                    ((CocheCambioAutomatico) c1).acelerar(60);
                }
                System.out.println("Matrícula " + c1.getMatricula());
                System.out.println("Velocidad " + c1.getVelocidad());
                System.out.println("Marcha " + c1.getMarcha());

                break;
            case 'm':
                c1 = new CocheCambioManual(matricula);
                if (c1 instanceof CocheCambioManual) {
                    ((CocheCambioManual) c1).acelerar(60);
                    ((CocheCambioManual) c1).cambiarmarcha(3);

                }
                System.out.println("Matrícula " + c1.getMatricula());
                System.out.println("Velocidad " + c1.getVelocidad());
                System.out.println("Marcha " + c1.getMarcha());

                break;
        }
    }
}
