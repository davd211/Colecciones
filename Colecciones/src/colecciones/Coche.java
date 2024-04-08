/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

/**
 *
 * @author David.P
 */
public class Coche implements Cloneable{
    private int velocidad;
    private static int numCoches=0;
  
    Coche() {
        velocidad = 0;
        numCoches++;
    }

    public int getNumCoches() {
        return numCoches;
    }

    public static void setNumCoches(int numCoches) {
        Coche.numCoches = numCoches;
    }
    
    public int getVelocidad(){
        return this.velocidad;
    }
    
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }
    
   
    
    public void acelera(int mas){
        this.velocidad = this.velocidad+mas;
    }
    public void frena(int menos){
        this.velocidad=this.velocidad-menos;
    }

    @Override
    public String toString() {
        return "Coche{" + "velocidad=" + velocidad + '}';
    }

    @Override
    protected Object clone()  {
        Object o = null ;
        try {
            o =  super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        } catch (CloneNotSupportedException ex) {
            System.out.println("Error al duplicar");
        }
        return o;
    }

   
    
    
    
    
}
