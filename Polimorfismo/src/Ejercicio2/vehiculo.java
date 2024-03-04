/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author David.P
 */
public abstract class vehiculo {

    protected String matricula;
    protected int km;
    protected int añomatriculacion;
    protected int numeroPuertas;

    public  abstract  void calculaVidaUtil();

    public vehiculo() {
    }

    public vehiculo(String matricula, int km, int añomatriculacion, int numeroPuertas) {
        this.matricula = matricula;
        this.km = km;
        this.añomatriculacion = añomatriculacion;
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

   

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getAñomatriculacion() {
        return añomatriculacion;
    }

    public void setAñomatriculacion(int añomatriculacion) {
        this.añomatriculacion = añomatriculacion;
    }

}

class Coche extends vehiculo {

    private int numPuertas;

    public Coche() {
    }

    public Coche(int numPuertas, String matricula, int km, int añomatriculacion, int numeroPuertas) {
        super(matricula, km, añomatriculacion, numeroPuertas);
        this.numPuertas = numPuertas;
    }

   

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

     public String tipoVehiculo(int numPuertas) {
        switch (numPuertas) {
            case 5:
                return "Multiuso";
            case 7:
                return "Berlina";
            case 3:
                return "Microcoche";
            default:
                return "Número de puertas no válido";
        }
    }

    
    
    
    
    
    
    @Override
    public void calculaVidaUtil() {
        System.out.println("Vida útil coche 10 años");
    }

  

}

class Camion extends vehiculo {

    private int tonelaje;
    private int altura;

    public Camion() {
    }

    public Camion(int tonelaje, int altura, String matricula, int km, int añomatriculacion, int numeroPuertas) {
        super(matricula, km, añomatriculacion, numeroPuertas);
        this.tonelaje = tonelaje;
        this.altura = altura;
    }

   
    public int getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void calculaVidaUtil() {
        System.out.println("Vida útil camión 5 años");
    }

   
}
