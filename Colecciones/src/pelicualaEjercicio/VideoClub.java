/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicualaEjercicio;

import java.util.ArrayList;

/**
 *
 * @author David.P
 */
public class VideoClub {
    
private ArrayList<Pelicula> listaPeliculas;   
private String nombre;

    public VideoClub()  {
        listaPeliculas = new ArrayList<Pelicula>();//esto es porque si no da petardazos
    }

    public VideoClub(String nombre) {//asi es la forma en la que lo recomienda la maestra 
        this.nombre = nombre;
        this.listaPeliculas= new  ArrayList<Pelicula> ();// esta linea es la que tenemsi que poner nosotros
    }

    public VideoClub(ArrayList<Pelicula> listaPeliculas, String nombre) {//este constructor no es el mas aconsejable
        this.listaPeliculas = new  ArrayList<Pelicula> (listaPeliculas) ;
        this.nombre = nombre;
    }

  
    public void insertarPelicula(Pelicula p){
        
        
        if (!this.listaPeliculas.contains(p)) {//la exclamacion es para negar como si la pelicula ya esta no la añadas 
            //de la otra forma si no ponemos eso diria que si esta se mete la pelicua
                    this.listaPeliculas.add(p);

        }
    }
    
}
