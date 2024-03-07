/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author David.P
 */
public class coche {

    protected String matricula;
    protected double velocidad;
    protected int marcha;

    public coche() {
    }

    public coche(String matricula) {
        this.matricula = matricula;
        if (this.velocidad < 0) {
            this.velocidad = 0;

        }

        if (this.marcha < 0) {
            this.marcha = 0;

        }
    }

    public String getMatricula() {
        return matricula;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getMarcha() {
        return marcha;
    }

    public void acelerar(int acelera) {

        this.velocidad = this.velocidad + acelera;

    }

    public void frenar(int frena) {

        this.velocidad = this.velocidad - frena;
    }

    protected void cambiarmarcha(int marcha) {
        if (marcha > 0) {
            this.marcha = marcha;
        }

    }

    @Override
    public String toString() {
        return "coche{" + "matricula=" + matricula + ", velocidad=" + velocidad + ", marcha=" + marcha + '}';
    }

}

class CocheCambioManual extends coche {

    public CocheCambioManual(String matricula) {
        super(matricula);

    }

    @Override //he cambiado de protected a public
    public void cambiarmarcha(int marcha) {
       this.marcha=marcha;
    }

}

class CocheCambioAutomatico extends coche {

    public CocheCambioAutomatico(String matricula) {
        super(matricula);
    }

    @Override
    public void frenar(int frena) {
        super.frenar(frena); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void acelerar(int acelera) {
        this.velocidad = this.velocidad + acelera;
        if (this.velocidad < 10) {
            cambiarmarcha(1);
        } else if (this.velocidad < 30) {
            cambiarmarcha(2);
        } else if (this.velocidad <= 60) {
            cambiarmarcha(3);
        }
    }

}
