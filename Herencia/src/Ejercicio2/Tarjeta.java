/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author David.P
 */
public class Tarjeta {

    private final String pin;
    private final String puk;
    private Estado estado;
    private int numIntentos;

    public Tarjeta(String pin, String puk) {
        this.pin = pin;
        this.puk = puk;
        this.estado = Estado.apagada;
        this.numIntentos = 1;
    }

    public String getPin() {
        return pin;
    }

    public String getPuk() {
        return puk;
    }

    public Estado getEstado() {
        return estado;
    }

    public boolean encender(String pin) {
        if ((this.pin.equals(pin) &&(this.estado==Estado.apagada))) {
            
            this.estado=Estado.activa;
            this.numIntentos=0;
            return true;
        }else {
        
        //el pin no es valido
        if(this.numIntentos ==3){
       this.estado=Estado.bloqueada;
       return false;
        }else {
            this.numIntentos++;
            return false;
        }
        }
    }

    public boolean desbloquear(String puk) {

        if (this.puk.equals(puk)) {
            if (estado.equals(Estado.bloqueada)) {
                estado = Estado.activa;
                return true;

            } else {
                return false;

            }
        }
        return false;
    }
 public void apagar(){
  if (estado.equals(Estado.activa)){
  estado = Estado.apagada;
  
  }
 
 
 }
    public enum Estado {
        apagada, activa, bloqueada
    }

}
