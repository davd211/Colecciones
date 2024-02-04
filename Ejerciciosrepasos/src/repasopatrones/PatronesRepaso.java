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
public class PatronesRepaso {

    /**
     * @param args the command line arguments
     */
    //Buscar en una cadena un patrón que comience por CA, a continuación de 0 a más dígitos y cualquier carácter. Utilizar expresiones regulares. 

//Poner resultado con "println"
    public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);

        Pattern p = Pattern.compile("CA([0-9])([a-zA-Z])");
        Matcher m = p.matcher(teclado.nextLine());
        if (m.matches()) {

            System.out.println("Si, contiene el patrón");
        } else {
            System.out.println("No, no contiene el patrón");
        }

    }

}
