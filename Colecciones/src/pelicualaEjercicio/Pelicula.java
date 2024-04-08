/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicualaEjercicio;

/**
 *
 * @author David.P
 */
public class Pelicula {

    private String titulo;
    private String descripcion;
    private boolean prestada;

    public Pelicula(String titulo, String descripcion, boolean prestada) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prestada = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isPrestada() {
        return prestada;
    }

    public void setPrestada(boolean prestada) {
        this.prestada = prestada;
    }

    @Override
    public String toString() {
        String disponibilidad = this.prestada ? "Si" : "No";//esto es igual que el el if comentado
//        if (this.prestada) {
//            disponibilidad = "Si";
//        } else {
//            disponibilidad = "No";
//        }
        return "Pelicula{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", disponible=" + disponibilidad + '}';
    }

}
