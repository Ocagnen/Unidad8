/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad08;

import actividad04.*;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author javier
 */
public class Vehiculo implements Comparable<Vehiculo>, Serializable {

    private int bastidor;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

    public Vehiculo(int bastidor, String matricula, String marca,
            String modelo, String color, double tarifa) {

        this.bastidor = bastidor;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }

    public Vehiculo() {
    }

    public int getBastidor() {
        return bastidor;
    }

    public void setBastidor(int bastidor) {
        this.bastidor = bastidor;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.bastidor;
        hash = 53 * hash + Objects.hashCode(this.matricula);
        hash = 53 * hash + Objects.hashCode(this.marca);
        hash = 53 * hash + Objects.hashCode(this.modelo);
        hash = 53 * hash + Objects.hashCode(this.color);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.tarifa) ^ (Double.doubleToLongBits(this.tarifa) >>> 32));
        hash = 53 * hash + (this.disponible ? 1 : 0);
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
        final Vehiculo other = (Vehiculo) obj;
        if (this.bastidor != other.bastidor) {
            return false;
        }
        if (Double.doubleToLongBits(this.tarifa) != Double.doubleToLongBits(other.tarifa)) {
            return false;
        }
        if (this.disponible != other.disponible) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Matricula:" + matricula + " Marca:" + marca + " Modelo:" + modelo
                + " Color:" + color + " Tarifa:" + tarifa + " Disponible:" + disponible;
    }
    
    public String toStringFichero(){
        return ":"+bastidor + ":" + matricula + ":" + marca + ":" + modelo
                + ":" + color + ":" + tarifa + ":" + disponible;
    }

    @Override
    public int compareTo(Vehiculo v) {
        return this.compareTo(v);
    }

}
