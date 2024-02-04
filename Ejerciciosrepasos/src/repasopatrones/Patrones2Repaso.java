/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasopatrones;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author David.P
 */
public class Patrones2Repaso {

    /**
     * @param args the command line arguments
     */
    //Validar una matricula. 4 dígitos y 3 letras. Utilizar expresiones regulares.


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Pattern p = Pattern.compile("[1-9]{4}[a-zA-Z]{3}");
        Matcher m = p.matcher(teclado.nextLine());
        if (m.matches()) {

            System.out.println("Matrícula válida");
        } else {
            System.out.println("Matrícula no válida");
        }

    }

}
