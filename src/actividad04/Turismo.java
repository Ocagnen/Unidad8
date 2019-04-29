/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04;

/**
 *
 * @author javier
 */
public class Turismo extends Vehiculo {

    private int puertas;
    private boolean marchaAutomatica;

    public Turismo(int bastidor, String matricula, String marca, String modelo, String color,
            double tarifa, int puerta, boolean marchaAutomatica) {
        super(bastidor, matricula, marca, modelo, color, tarifa);

        this.puertas = puerta;
        this.marchaAutomatica = marchaAutomatica;
    }

    public Turismo() {

    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean getMarchaAutomatica() {
        return marchaAutomatica;
    }

    public void setMarchaAutomatica(boolean marchaAutomatica) {
        this.marchaAutomatica = marchaAutomatica;
    }

    //Método sobrescrito. Polimorfismo 
    @Override
    public String toString() {
        return super.toString() + " Puertas:" + puertas + " Marcha automatica:" + marchaAutomatica;
    }
    
    @Override
    public String toStringFichero(){
        return super.toStringFichero() + ":" + puertas + " :" + marchaAutomatica;
    }

    public void transportarSuegros() {
        System.out.println("Solo los turismos transportan suegros");

    }

}
