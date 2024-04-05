/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.ArrayList;

/**
 *
 * @author David.P
 */
public class ArrayListMain2 {

    /**
     * @param args the command line arguments
     * 
     * Una coleccion es como un array pero que en su defecto este si tiene una capacidad variable, a su 
     * diferencia que el array si se le establece una longitud no se puede sobrepasar este.
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<String> listaString = new ArrayList<String>(20);
        // cuando ponemos que sea <String> es que tiene que ser un tipo de clase no vale un tipo primitivo
        //por lo que los tipos que no valen son int --> seria Integer
        
        
//        LinkedList<String> lista = new LinkedList<String>();
        for (int i = 0; i < 20; i++) {
            listaString.add("Cadena n�mero " + i);
        }
     
       //con este for es el que utilizo para rellenar, aqui tengo que meter un numero si o si para añadir.
       
        for (int i = 0; i < listaString.size(); i++) {
            System.out.println(listaString.get(i));
            
        }
        // esto es lo que hace que pueda recoorer ese array dinamico en el for se hace con el size porque recorre todo 
        //sepamos o no cuantos elementos tienen.
        
        
        System.out.println("La colecci�n tiene " + listaString.size() + " elementos");
    //------------------------------------------------------------------------------------------------------

        
   //for each --> este es el que mas se utiliza para los arrays dinamicos/colecciones.
   // lo que hace es que los valores segun se va recorriendo con el for se va guardando en la variable a
   // por lo que se va mostrando el valor que adquiere al recorrer.
        for (String a: listaString){
            System.out.println(a);
        }
   //-----------------------------------BORRAR-------------------------------------------------------------------
   
   //para borrar se utiliza el for normal y para mostarr se utiliza el for each.
        for (int i = 0; i < listaString.size(); i++) {
            if (listaString.get(i).equals("Cadena número 2")) {
                listaString.remove(i);
            }
            System.out.println(listaString.get(i));
        }
   
   //------------------------------------------------------------------------------------------------------
           
        System.out.println("ArrayList------------");
          ArrayList b = new ArrayList();//aqui no se esta declarando de que tipo es, puede ser de cualquier objeto
          //como todos los vienen de la clase padre Object se pondria mas abajo asi
        b.add("Hola");
        b.add ("Adi�s");
        b.add("Hasta Luego");
        for (Object o: b){ // ponemso que viene de la clase Object porque arriba no hemos declarado que
            //tipo iba a ser
            System.out.println(o);
        }
       
       

    }
   

}