/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad08;

import actividad04.*;
import java.io.Serializable;

/**
 *
 * @author javier
 */
public class Furgoneta extends Vehiculo implements Serializable{

    private int carga;
    private int volumen;

    public Furgoneta(int bastidor, String matricula, String marca, String modelo,
            String color, double tarifa, int carga, int volumen) {

        super(bastidor, matricula, marca, modelo, color, tarifa); // Constructor padre
        this.carga = carga;
        this.volumen = volumen;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public int hashCode() {
        int hash = 5 + super.hashCode();
        hash = 53 * hash + this.carga;
        hash = 53 * hash + this.volumen;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Furgoneta other = (Furgoneta) obj;
        if (!(super.equals(obj))) {
            return false;
        }
        if (this.carga != other.carga) {
            return false;
        }
        if (this.volumen != other.volumen) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return super.toString() + "Carga:" + carga + " Volumen:" + volumen;
    }
    
    @Override
    public String toStringFichero(){
         return super.toStringFichero() + ":" + carga + ":" + volumen;
    }

    public void cargarTomates() {
        System.out.println("Solo las furgonetas pueden cargar tomates");
    }
}
