///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package interfaces;
//
////import java.util.Scanner;
////
/////**
//// *
//// * @author David.P
//// */
////public class mainBiblioteca {
////
////    /**
////     * @param args the command line arguments
////     */
////    public static void main(String[] args) {
////        Scanner teclado = new Scanner(System.in);
////
////        Biblioteca b1 = null;
////        System.out.println("Quieres crear un libro (l) o una revista (r)");
////
////        int codigo = teclado.nextInt();
////        teclado.next();
////        String titulo = teclado.nextLine();
////
////        int año = teclado.nextInt();
////        teclado.next();
////
////        char tipo = teclado.nextLine().charAt(0);
////        switch (tipo) {
////            case 'l'://hayque poner los teclado del constructor fuera y pedirlo por variables porque hay que limpiar el buffer entre un entero y una linea 
////                if (b1 instanceof Libro) {
////
////                    b1 = new Libro(codigo, titulo, año);
////                    System.out.println("Deseas prestar el libro (s/n)");
////                    switch (teclado.nextLine().charAt(0)) {
////                        case 's':
////                            ((Libro) b1).setPrestado(true);
////                            break;
////                        case 'n':
////                            ((Libro) b1).setPrestado(false);
////
////                            break;
////                    }
////                }
////                break;
////            case 'r':
////
////                break;
////
////        }
////
////    }
////}
//import java.util.Scanner;
//
//public class LibroMain {
//
//    public static void main(String[] args) {
//
//        Scanner tec = new Scanner(System.in);
//
//        Libro l1;
//        
//        System.out.println("Quieres crear un libro (l) o una revista (r)");
//        
//        char tipo = tec.nextLine().charAt(0);
//
//        if (tipo == 'l') {
//
//            l1 = new Libros();
//            l1.setCódigo(tec.nextLine());
//            l1.setTitulo(tec.nextLine());
//            l1.setAnnoPublicacion(tec.nextInt());
//
//            System.out.println("Deseas prestar el libro (s/n)");
//            tec.nextLine();
//            
//            if (tec.nextLine().charAt(0) == 's') {
//
//                ((Libros) l1).prestar();
//
//            }
//            
//            String stado;
//            if (((Libros) l1).prestado()==true) {
//                
//                stado="Prestado";
//            } else{
//                
//                stado="Disponible";
//                
//            }
//            
//            System.out.println("Año publicación: "+l1.getAnnoPublicacion());
//            System.out.println("Código: "+l1.getCódigo());
//            System.out.println(stado);
//            System.out.println(((Libros)l1).toString());
//            
//            
//               
//        } else if (tipo == 'r') {
//            
//            l1= new Revistas();
//            
//            l1.setCódigo(tec.nextLine());
//            l1.setTitulo(tec.nextLine());
//            l1.setAnnoPublicacion(tec.nextInt());
//            
//            ((Revistas)l1).setnumero(tec.nextInt());
//            
//            System.out.println("Año publicación: "+l1.getAnnoPublicacion());
//            System.out.println("Código: "+l1.getCódigo());
//            System.out.println(((Revistas)l1).toString());
//        }
//
//    }
//
//}
//
//
////interface Prestable {
//
//    public void prestar();
//
//    public void devolver();
//    public boolean prestado();
//
//}
//
//abstract class Libro {
//
//
//    protected String código;
//    protected String titulo;
//    protected int annoPublicacion;
//    
//
//    public Libro(String código, String titulo, int annoPublicacion) {
//        this.código = código;
//        this.titulo = titulo;
//        this.annoPublicacion = annoPublicacion;
//    }
//
//    public Libro() {
//    }
//
//    
//    public String getCódigo() {
//        return código;
//    }
//
//    public void setCódigo(String código) {
//        this.código = código;
//    }
//
//    public String getTitulo() {
//        return titulo;
//    }
//
//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }
//
//    public int getAnnoPublicacion() {
//        return annoPublicacion;
//    }
//
//    public void setAnnoPublicacion(int annoPublicacion) {
//        this.annoPublicacion = annoPublicacion;
//    }
//
//    @Override
//    public String toString() {
//        return "{" + "codigo=" + código + ", titulo=" + titulo + ", anioPublicacion=" + annoPublicacion + '}';
//    }
//
//    
//    
//    
//
//}
//
//class Revistas extends Libro{
//
//    public int numero;
//
//    public Revistas(int numero, String código, String titulo, int annoPublicacion) {
//        super(código, titulo, annoPublicacion);
//        this.numero = numero;
//    }
//
//    public Revistas() {
//    }
//
//    @Override
//    public String toString() {
//        return "Revista{" + super.toString() +"numero=" + numero + '}';
//    }
//
//    public int getNumero() {
//        return numero;
//    }
//
//    
//    public int getnumero(){
//    
//        return this.numero;
//        
//    }
//    
//    public void setnumero(int numero){
//    
//        this.numero=numero;
//        
//    }
//    
//}
//
//class Libros extends Libro{
//
//    private boolean prestado = false;
//
//    public boolean prestado() {
//        return prestado;
//    }
//
//    public void devolver(){
//        this.prestado=false;
//    }
//    
//    
//    public void prestar(){
//        this.prestado=true;
//    }
//
//    @Override
//    public String toString() {
//        return "Libro{" + super.toString()+ "prestado=" + prestado + '}';
//    }
//    
//    
//}