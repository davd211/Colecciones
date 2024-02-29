package Ejercicio1;

import java.util.Scanner;

public class mainEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qué tipo de empleado desea crear Administrativo(a) o Programador (p) ");

        char tipoEmpleado = teclado.nextLine().charAt(0);

        if (tipoEmpleado == 'a') {

            Administrativo a1 = new Administrativo();
            System.out.println("Introduce nombre administrativo");
            a1.setNombre(teclado.nextLine());
            System.out.println("¿Está casad@? s/n");
            char casado = teclado.nextLine().charAt(0);
            if (casado == 's') {
                a1.setCasado(true);

            } else {
                a1.setCasado(false);
            }
            System.out.println("Introduzca nivel de inglés. Alto: a. Medio: m. Bajo: b");

            char nivel = teclado.nextLine().charAt(0);
            switch (nivel) {
                case 'a':
                    a1.setNi(Administrativo.nivelingles.alto);
                    break;
                case 'm':
                    a1.setNi(Administrativo.nivelingles.medio);
                    break;
                case 'b':
                    a1.setNi(Administrativo.nivelingles.bajo);
                    break;

            }

            System.out.println("Introduzca su edad");
            try {
                a1.setEdad(teclado.nextInt());

            } catch (EEdadNoValida e) {
                System.out.println(e.getMessage());
            }
            teclado.nextLine();
        } else if (tipoEmpleado == 'p') {

            Programador p1 = new Programador();
            System.out.println("Introduce nombre administrativo");
            p1.setNombre(teclado.nextLine());
            System.out.println("¿Está casad@? s/n");
              char casado = teclado.nextLine().charAt(0);
            if (casado == 's') {
                p1.setCasado(true);

            } else {
                p1.setCasado(false);
            }
            System.out.println("Lineas de código por hora");
            p1.setLineasDeCodigoPorHora(teclado.nextInt());
            System.out.println("Introduzca su edad");
            try {
                p1.setEdad(teclado.nextInt());

            } catch (EEdadNoValida e) {
                System.out.println(e.getMessage());
            }
            teclado.nextLine();

        }
    }
}
