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
        this.estado = Estado.APAGADA;
        this.numIntentos = 0;
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

        if (estado != Estado.APAGADA) {
            return false;
        }
        if (this.pin.equals(pin)) {
            estado = Estado.ACTIVA;
            numIntentos = 0;
            return true;
        } else {
            if (numIntentos == 3) {

                estado = Estado.BLOQUEADA;
                return false;
            } else {
                if (numIntentos != 3) {
                    numIntentos++;
                    return false;
                }

            }
        }
        return false;
    }

    public boolean desbloquear(String puk) {

        if (this.puk.equals(puk)) {
            if (estado.equals(Estado.BLOQUEADA)) {
                estado = Estado.ACTIVA;
                return true;

            } else {
                return false;

            }
        }
        return false;
    }
 public void apagar(){
  if (estado.equals(Estado.BLOQUEADA)){
  estado = Estado.APAGADA;
  
  }
 
 
 }
    public enum Estado {
        APAGADA, ACTIVA, BLOQUEADA
    }

}
