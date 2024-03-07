/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multimedia;

/**
 *
 * @author David.P
 */
public class Disco extends Multimedia{
    
    enum Tipo{
    rock, pop, soul, blues, clásica;
    
    }
    
    Tipo estilo;

    public Tipo getEstilo() {
        return estilo;
    }

    @Override
    public String toString() {
        return super.toString() + " "+ estilo; 
    }

   
    
    
}
