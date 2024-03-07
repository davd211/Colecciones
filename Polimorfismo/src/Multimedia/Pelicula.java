/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multimedia;


/**
 *
 * @author Usuario
 */
public class Pelicula extends Multimedia {

    private String actor;
    private String actriz;

   

    public Pelicula(String actor, String actriz) {
        if (actor == null && actriz == null) {
            System.out.println("alguien tiene que trabajar");
        }else{
            this.actor = actor;
            this.actriz = actriz;
        }
    }

    public Pelicula(String actor, String actriz, String titulo, String autor, int duracion) throws excepcion {
        super(titulo, autor, duracion);
       if (actor == null && actriz == null) {
            System.out.println("alguien tiene que trabajar");
        }else{
            this.actor = actor;
            this.actriz = actriz;
        }
    }

    public String getActor() {
        return actor;
    }

    public String getActriz() {
        return actriz;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
}