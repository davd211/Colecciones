/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author David.P
 */
public class Biblioteca {
    
    protected int codigo;
    protected String titulo;
    protected int año;

    public Biblioteca(int codigo, String titulo, int año) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAño() {
        return año;
    }

    
    
    @Override
    public String toString() {
        return "Biblioteca{" + "codigo=" + codigo + ", titulo=" + titulo + ", a\u00f1o=" + año + '}';
    }
    
    
    
}
class Libro extends Biblioteca implements Prestable{

    private boolean prestado;

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }


    public Libro(int codigo, String titulo, int año) {
        super(codigo, titulo, año);
        this.prestado = false;
    }

    @Override
    public String toString() {
        return "Libro{" + super.toString()+"prestado=" + prestado + '}';
    }

    @Override
    public void prestar() {

this.prestado= true;
    }

    @Override
    public void devolver() {
this.prestado = false;

    }

    @Override
    public boolean prestado() {
        
        return this.prestado;
   }
    

  

   


}

class Revista extends Biblioteca {

    private int numero;

    public Revista(int codigo, String titulo, int año, int numero) {
        super(codigo, titulo, año);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista{" + super.toString()+"numero=" + numero + '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

 
    
    

    
}