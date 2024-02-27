package Ejercicio1;

import java.util.Scanner;

public class mainEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EEdadNoValida {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qué tipo de empleado desea crear Administrativo(a) o Programador (p) ");

        char tipoEmpleado = teclado.nextLine().charAt(0);

        if (tipoEmpleado == 'a') {

            Administrativo a1 = new Administrativo();
            System.out.println("Introduce nombre administrativo");
            a1.setNombre(teclado.nextLine());
            System.out.println("¿Está casad@? s/n");
            System.out.println("Introduzca nivel de inglés. Alto: a. Medio: m. Bajo: b");
            System.out.println("Introduzca su edad");
           a1.setEdad(teclado.nextInt());
            teclado.nextLine();
        } else if (tipoEmpleado == 'p') {

            Programador p1 = new Programador();
            System.out.println("Introduce nombre administrativo");
            p1.setNombre(teclado.nextLine());
            System.out.println("¿Está casad@? s/n");
            System.out.println("Introduzca nivel de inglés. Alto: a. Medio: m. Bajo: b");
            System.out.println("Introduzca su edad");
             p1.setEdad(teclado.nextInt());
            teclado.nextLine();
            
        }
    }
}
