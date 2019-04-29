/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author javier
 */
public class MisVehiculos {

    public static void main(String args[]) {
        
        ArrayList<Vehiculo> listaV = new ArrayList<>();
        
        Vehiculo v1 = new Furgoneta(20, "5698-clv", "Renaul", "X1", "Verde", 50, 20, 2000);
        Vehiculo v2 = new Furgoneta(100, "5698-clv", "Renaul", "X1", "Verde", 50, 20, 2000);
        Vehiculo v3 = new Furgoneta(30, "5698-clv", "Renaul", "X1", "Verde", 50, 20, 2000);
        Vehiculo v4 = new Furgoneta(60, "5698-clv", "Renaul", "X1", "Verde", 50, 20, 2000);
        Vehiculo v5 = new Furgoneta(230, "5698-clv", "Renaul", "X1", "Verde", 50, 20, 2000);
        Vehiculo v6 = new Furgoneta(110, "5698-clv", "Renaul", "X1", "Verde", 50, 20, 2000);
        Vehiculo v7 = new Furgoneta(40, "5698-clv", "Renaul", "X1", "Verde", 50, 20, 2000);
        Vehiculo v8 = new Furgoneta(450, "5698-clv", "Renaul", "X1", "Verde", 50, 20, 2000);
        Vehiculo v9 = new Furgoneta(360, "5698-clv", "Renaul", "X1", "Verde", 50, 20, 2000);
        Vehiculo v10 = new Furgoneta(70, "5698-clv", "Renaul", "X1", "Verde", 50, 20, 2000);
        
        Vehiculo t1 = new Turismo(230, "0858-LOP", "Fiat", "X23", "Azul", 60, 30, true);
        Vehiculo t2 = new Turismo(230, "0858-LOP", "Fiat", "X23", "Azul", 60, 30, true);
        Vehiculo t3 = new Turismo(230, "0858-LOP", "Fiat", "X23", "Azul", 60, 30, true);
        Vehiculo t4 = new Turismo(230, "0858-LOP", "Fiat", "X23", "Azul", 60, 30, true);
        Vehiculo t5 = new Turismo(230, "0858-LOP", "Fiat", "X23", "Azul", 60, 30, true);
        Vehiculo t6 = new Turismo(230, "0858-LOP", "Fiat", "X23", "Azul", 60, 30, true);
        Vehiculo t7 = new Turismo(230, "0858-LOP", "Fiat", "X23", "Azul", 60, 30, true);
        Vehiculo t8 = new Turismo(230, "0858-LOP", "Fiat", "X23", "Azul", 60, 30, true);
        Vehiculo t9 = new Turismo(230, "0858-LOP", "Fiat", "X23", "Azul", 60, 30, true);
        Vehiculo t10 = new Turismo(230, "0858-LOP", "Fiat", "X23", "Azul", 60, 30, true);
        
        Vehiculo d1 = new Deportivo(350, "7463-LP", "Seat", "X5", "Rojo", 30, 690);
        Vehiculo d2 = new Deportivo(350, "7463-LP", "Seat", "X5", "Rojo", 30, 690);
        Vehiculo d3 = new Deportivo(350, "7463-LP", "Seat", "X5", "Rojo", 30, 690);
        Vehiculo d4 = new Deportivo(350, "7463-LP", "Seat", "X5", "Rojo", 30, 690);
        Vehiculo d5 = new Deportivo(350, "7463-LP", "Seat", "X5", "Rojo", 30, 690);
        Vehiculo d6 = new Deportivo(350, "7463-LP", "Seat", "X5", "Rojo", 30, 690);
        Vehiculo d7 = new Deportivo(350, "7463-LP", "Seat", "X5", "Rojo", 30, 690);
        Vehiculo d8 = new Deportivo(350, "7463-LP", "Seat", "X5", "Rojo", 30, 690);
        Vehiculo d9 = new Deportivo(350, "7463-LP", "Seat", "X5", "Rojo", 30, 690);
        Vehiculo d10 = new Deportivo(350, "7463-LP", "Seat", "X5", "Rojo", 30, 690);
        
        listaV.add(t1);
        listaV.add(t2);
        listaV.add(t3);
        listaV.add(t4);
        listaV.add(t5);
        listaV.add(t6);
        listaV.add(t7);
        listaV.add(t8);
        listaV.add(t9);
        listaV.add(t10);
        
        listaV.add(d1);
        listaV.add(d2);
        listaV.add(d3);
        listaV.add(d4);
        listaV.add(d5);
        listaV.add(d6);
        listaV.add(d7);
        listaV.add(d8);
        listaV.add(d9);
        listaV.add(d10);
        
        listaV.add(v1);
        listaV.add(v2);
        listaV.add(v3);
        listaV.add(v4);
        listaV.add(v5);
        listaV.add(v6);
        listaV.add(v7);
        listaV.add(v8);
        listaV.add(v9);
        listaV.add(v10);
        
        
        
        String fichero = "vehiculos.txt";
        
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(fichero))){
            
            for (int i = 0; i < listaV.size(); i++) {
                
                if(listaV.get(i) instanceof Turismo){
                    flujo.write("0 ");
                } else if (listaV.get(i) instanceof Deportivo){
                    flujo.write("1 ");
                } else {
                    flujo.write("2 ");
                }
                
                flujo.write("- ");
                flujo.write(listaV.get(i).toStringFichero());
                flujo.newLine();
            }
            
            flujo.flush();
            
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        
        String tmp;
        
        
        
        
        
        
    }
}

