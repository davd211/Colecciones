/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Persona;

import java.util.Scanner;

/**
 *
 * @author David.P
 */
public class MainPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char a = teclado.nextLine().charAt(0);
        switch (a) {
            case 'f':
                Profesor p1 = new Profesor();
                p1.setDni(teclado.nextLine());
                p1.setNombre(teclado.nextLine());
                p1.setEdad(teclado.nextInt());
                p1.setDireccion(teclado.nextLine());
                p1.setTitulacion(teclado.nextLine());
               // p1.set
                
                System.out.println("hola");
                break;
            case 'i':
                ProfesorInterino p2 = new ProfesorInterino();
                p2.getDni();

                System.out.println("hola2");

                break;
            case 'a':
                Alumnos a1 = new Alumnos();
                a1.getDni();

                System.out.println("hola3");

                break;
        }

    }

}
