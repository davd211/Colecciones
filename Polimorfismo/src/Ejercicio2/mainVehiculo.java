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

        vehiculo c1 = null;
//identificar al coche o camion
        System.out.println("Qué deseas crear coche(co) o camión (ca)");
        String id = teclado.nextLine();
        switch (id) {
            case "ca":

                c1 = new Camion();
                c1.setMatricula(teclado.nextLine());
                c1.setKm(teclado.nextInt());
                c1.setAñomatriculacion(teclado.nextInt());
                ((Camion) c1).setAltura(teclado.nextInt());//tengo que poner el tonelaje y la altura 
                ((Camion) c1).setTonelaje(teclado.nextInt());
                System.out.println(((Camion) c1).vidaUtil());
                break;
            case "co":

                c1 = new Coche();

                c1.setMatricula(teclado.nextLine());
                c1.setKm(teclado.nextInt());
                c1.setAñomatriculacion(teclado.nextInt());
                ((Coche) c1).setNumeroPuertas(teclado.nextInt());
                System.out.println(((Coche) c1).vidaUtil());
                System.out.println("Tipo Coche " + ((Coche) c1).tipoVehiculo());
                break;

        }
    }
}


//import java.util.Scanner;
//
///**
// *
// * @author David.P
// */
//public class mainVehiculo {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//
//        Scanner teclado = new Scanner(System.in);
//
//        vehiculo c1 = null;
////identificar al coche o camion
//        System.out.println("Qué deseas crear coche(co) o camión (ca)");
//        String id = teclado.nextLine();
//        switch (id) {
//            case "ca":
//              
//
//                    c1 = new Camion();
//                    c1.setMatricula(teclado.nextLine());
//                    c1.setKm(teclado.nextInt());
//                    c1.setAñomatriculacion(teclado.nextInt());
//                    ((Camion) c1).setAltura(teclado.nextInt());//tengo que poner el tonelaje y la altura 
//                    ((Camion) c1).setTonelaje(teclado.nextInt());
//                System.out.println(((Camion) c1).vidaUtil());
//                
//                break;
//            case "co":
//
//                    c1 = new Coche();
//
//                    c1.setMatricula(teclado.nextLine());
//                    c1.setKm(teclado.nextInt());
//                    c1.setAñomatriculacion(teclado.nextInt());
//                    ((Coche) c1).setNumeroPuertas(teclado.nextInt());
//                    System.out.println(((Coche) c1).vidaUtil());
//                    System.out.println("Tipo Coche " + ((Coche) c1).tipoVehiculo());
//                    break;
//
//                
//
//        }
//    }
//}
//
////abstract class vehiculo {
////
////    protected String matricula;
////    protected int km;
////    protected int añomatriculacion;
////
////   abstract public String vidaUtil();
////
////    public vehiculo() {
////    }
////
////    public vehiculo(String matricula, int km, int añomatriculacion) {
////        this.matricula = matricula;
////        this.km = km;
////        this.añomatriculacion = añomatriculacion;
////    }
////
////    public String getMatricula() {
////        return matricula;
////    }
////
////    public void setMatricula(String matricula) {
////        this.matricula = matricula;
////    }
////
////    public int getKm() {
//        return km;
//    }
//
//    public void setKm(int km) {
//        this.km = km;
//    }
//
//    public int getAñomatriculacion() {
//        return añomatriculacion;
//    }
//
//    public void setAñomatriculacion(int añomatriculacion) {
//        this.añomatriculacion = añomatriculacion;
//    }
//
//}
//
//class Coche extends vehiculo {
//
//    private int numeroPuertas;
//
//    public Coche() {
//    }
//
//    public Coche(String matricula, int km, int añomatriculacion, int numeroPuertas) {
//        super(matricula, km, añomatriculacion);
//        this.numeroPuertas = numeroPuertas;
//
//    }
//
//    public int getNumeroPuertas() {
//        return numeroPuertas;
//    }
//
//    public void setNumeroPuertas(int numeroPuertas) {
//        this.numeroPuertas = numeroPuertas;
//    }
//
//    public String tipoVehiculo() {
//        switch (this.numeroPuertas) {
//            case 5:
//                return "Multiuso";
//            case 7:
//                return "Berlina";
//            case 3:
//                return "Microcoche";
//            default:
//                return "Número de puertas no válido";
//        }
//    }
//
// 
//    @Override
//    public String vidaUtil() {
//                return "Vida útil coche 10 años";
//
//    }
//
//}
//
//class Camion extends vehiculo {
//
//    private int tonelaje;
//    private int altura;
//
//    public Camion() {
//    }
//
//    public Camion(int tonelaje, int altura, String matricula, int km, int añomatriculacion, int numeroPuertas) {
//        super(matricula, km, añomatriculacion);
//        this.tonelaje = tonelaje;
//        this.altura = altura;
//    }
//
//    public int getTonelaje() {
//        return tonelaje;
//    }
//
//    public void setTonelaje(int tonelaje) {
//        this.tonelaje = tonelaje;
//    }
//
//    public int getAltura() {
//        return altura;
//    }
//
//    public void setAltura(int altura) {
//        this.altura = altura;
//    }
//
//    
//
//    @Override
//    public String vidaUtil() {
//        return "Vida útil coche 5 años";
//    }
//
//}
