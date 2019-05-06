/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad08;

import actividad04.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(fichero))) {

            for (int i = 0; i < listaV.size(); i++) {

                if (listaV.get(i) instanceof Turismo) {
                    flujo.write("0 ");
                } else if (listaV.get(i) instanceof Deportivo) {
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
        String[] arr1;
        ArrayList<Vehiculo> listaVehi = new ArrayList<>();

        try (Scanner datosFichero = new Scanner(new File(fichero))) {

            while (datosFichero.hasNextLine()) {
                tmp = datosFichero.nextLine();
                tmp = tmp.substring(3);

                arr1 = tmp.split(":");

                listaVehi.add(new Vehiculo(Integer.parseInt(arr1[1]), arr1[2], arr1[3], arr1[4], arr1[5], Double.parseDouble(arr1[6])));

            }

        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }

        System.out.println("-------------------------------");

        for (Vehiculo vehiculo : listaVehi) {
            System.out.println(vehiculo);
        }

        System.out.println("--NUEVA LISTA--");
        ArrayList<Vehiculo> listaFurg = new ArrayList<>();
        ArrayList<Vehiculo> listaTurism = new ArrayList<>();
        ArrayList<Vehiculo> listaDepor = new ArrayList<>();

        for (Vehiculo vehiculo : listaV) {

            if (vehiculo instanceof Furgoneta) {
                listaFurg.add(vehiculo);
            } else if (vehiculo instanceof Turismo) {
                listaTurism.add(vehiculo);
            } else if (vehiculo instanceof Deportivo) {
                listaDepor.add(vehiculo);
            }
        }
        
        System.out.println("Lista de furgonetas");
        for (Vehiculo vehiculo : listaFurg) {
            System.out.println(vehiculo);
        }
        
        System.out.println("Lista de Turismos");        
        for (Vehiculo vehiculo : listaTurism) {
            System.out.println(vehiculo);
        }
        
        System.out.println("Lista de deportivos");
        for (Vehiculo vehiculo : listaDepor) {
            System.out.println(vehiculo);
        }
        
        System.out.println("Crear furgonetas");
        
        String fichero1 = "furgonetas.dat";
        
        try (ObjectOutputStream flujo = new ObjectOutputStream(new FileOutputStream(fichero1))) {
            
            for (int i = 0; i < listaFurg.size(); i++) {
                flujo.writeObject(listaFurg.get(i));
            }

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Crear turismos");
        
        String fichero2 = "turismos.dat";
        
        try (ObjectOutputStream flujo = new ObjectOutputStream(new FileOutputStream(fichero2))) {
            
            for (int i = 0; i < listaTurism.size(); i++) {
                flujo.writeObject(listaTurism.get(i));
            }

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Crear deportivos");
        
        String fichero3 = "deportivos.dat";
        
        try (ObjectOutputStream flujo = new ObjectOutputStream(new FileOutputStream(fichero3))) {
            
            for (int i = 0; i < listaDepor.size(); i++) {
                flujo.writeObject(listaDepor.get(i));
            }

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        

    }
}
