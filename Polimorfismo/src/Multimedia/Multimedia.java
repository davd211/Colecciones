/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multimedia;

import java.util.Objects;

/**
 *
 * @author David.P
 */
public class Multimedia  {

    protected String titulo;
    protected String autor;
    protected Formato formato;
    protected int duracion;

    public Multimedia(String titulo, String autor, Formato formato, int duracion) throws duracionexception  {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        if (duracion < 0) {
            throw new duracionexception("Duracion no valida");
        }
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Multimedia{" + "titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion + '}';
    }

 

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Multimedia other = (Multimedia) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }

  
    
    
    
    
    
    

     protected enum Formato {

        wav, mp3, mp4
    }
}

class Pelicula extends Multimedia{

   
private String actorPrincipal;
private String actrizPrincipal;

    public Pelicula(String actorPrincipal, String actrizPrincipal, String titulo, String autor, Formato formato, int duracion) throws duracionexception {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

   

   

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal + '}';
    }

    
  
   



}

class Disco extends Multimedia{

private Genero genero;

    public Disco(Genero genero, String titulo, String autor, Formato formato, int duracion) throws duracionexception {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Disco{" + "genero=" + genero + '}';
    }

    
    
    public enum Genero {
    
    rock, pop, soul, blues, clásica
    }

}



 class duracionexception extends Exception{

    public duracionexception() {
    }

    public duracionexception(String message) {
        super(message);
    }

  

 

}
