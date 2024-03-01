/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author David.P
 */
public class Cerrojo {

    private String combinacion;//secuencia de 3 digitos

    public Cerrojo(String combinacion) {
        this.combinacion = combinacion;
    }

    public boolean abrir(String comPrueba) {

        if (this.combinacion.equals(comPrueba)) {
            System.out.println("El cerrojo está abierto");
            return true;

        } else {
            System.out.println("no se puede abrir");
            return false;
        }

    }
    
    public boolean cambiarCombinacion(String nuevaCombinacion,String combinacion){

  if (this.combinacion.equals(combinacion)) {
      
      this.combinacion = nuevaCombinacion;

            return true;

        } else {
      System.out.println("combinacion no es correcta");
            return false;
        }
        
        
}

 public void cerrar(){
 
 // this.abrir = false;
   System.out.println("Cerrojo cerrado");

 }

    public String getCombinacion() {
        return combinacion;
    }

    public void setCombinacion(String combinacion) {
        this.combinacion = combinacion;
    }
 
 
}
