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
        Persona p1 = null;
        char a = teclado.nextLine().charAt(0);
        switch (a) {
            case 'f':
                p1 = new Profesor();
                p1.setDni(teclado.nextLine());
                p1.setNombre(teclado.nextLine());
                p1.setEdad(teclado.nextInt());
                p1.setDireccion(teclado.nextLine());
                teclado.nextLine();

                if (p1 instanceof Profesor) {

                    ((Profesor) p1).setTitulacion(teclado.nextLine());
                    ((Profesor) p1).setExperiencia(teclado.nextInt());
                    System.out.print("Sueldo profesor " + ((Profesor) p1).calcularSueldo());

                }

                break;
            case 'i':
                p1 = new ProfesorInterino();
                p1.setDni(teclado.nextLine());
                p1.setNombre(teclado.nextLine());
                p1.setEdad(teclado.nextInt());
                p1.setDireccion(teclado.nextLine());
                teclado.nextLine();

                if (p1 instanceof ProfesorInterino) {

                    System.out.print("Sueldo profesor " + ((ProfesorInterino) p1).calcularSueldo());

                }

                break;
            case 'a':
                p1 = new Alumnos();
                p1.setDni(teclado.nextLine());
                p1.setNombre(teclado.nextLine());
                p1.setEdad(teclado.nextInt());
                p1.setDireccion(teclado.nextLine());
                teclado.nextLine();

                if (p1 instanceof Alumnos) {

                    System.out.print("Precio matrícula " + ((Alumnos) p1).calcularMatricula());

                }

                break;
        }

    }

}
