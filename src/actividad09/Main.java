/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad09;

import actividad08.Furgoneta;
import actividad08.Vehiculo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author javier
 */
public class Main {

    public static void main(String[] args) {

        // Creo directorio
        Path directory = Paths.get("./copias");
        try {
            Files.createDirectory(directory);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio.");
            System.out.println(e.toString());
        }

        // Copiar archivos
        Path origen = Paths.get("/home/javier/NetBeansProjects/Unidad8/furgonetas.dat");
        Path destino = Paths.get("/home/javier/NetBeansProjects/Unidad8/copias/furgonetas.dat");
        try {
            Files.copy(origen, destino);
        } catch (IOException e) {
            System.out.println("Problema copiando el archivo.");
            System.out.println(e.toString());
        }

        Path origen2 = Paths.get("/home/javier/NetBeansProjects/Unidad8/turismos.dat");
        Path destino2 = Paths.get("/home/javier/NetBeansProjects/Unidad8/copias/turismos.dat");
        try {
            Files.copy(origen2, destino2);
        } catch (IOException e) {
            System.out.println("Problema copiando el archivo.");
            System.out.println(e.toString());
        }

        Path origen3 = Paths.get("/home/javier/NetBeansProjects/Unidad8/deportivos.dat");
        Path destino3 = Paths.get("/home/javier/NetBeansProjects/Unidad8/copias/deportivos.dat");
        try {
            Files.copy(origen3, destino3);
        } catch (IOException e) {
            System.out.println("Problema copiando el archivo.");
            System.out.println(e.toString());
        }

        // Mostrar el contenido
        System.out.println("");
        System.out.println("Mostrar contenido de carpeta");
        File f = new File("copias");
        if (f.exists()) {
            File[] ficheros = f.listFiles();
            for (File file2 : ficheros) {
                System.out.println(file2.getName());
            }
        } else {
            System.out.println("El directorio a listar no existe");
        }

        // Leer los ficheros e ir guardandolo en una carpeta de vehiculos        
        ArrayList<Vehiculo> listaV = new ArrayList<>();
        FileInputStream fich = null;

        try {
            fich = new FileInputStream("furgonetas.dat");

            // A partir del fichero anterior se crea el flujo para leer objetos
            // Estructura try-with-resources
            try (ObjectInputStream flujo = new ObjectInputStream(fich)) {

                Vehiculo a;
                while (fich.available() > 0) {
                    // Se hace un casting explícito del objeto devuelto
                    // por readObject()
                    a = (Vehiculo) flujo.readObject();
                    // Añade el objeto a la lista
                    listaV.add(a);
                }

            } catch (ClassNotFoundException | IOException e) { // Multicatch
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("EL fichero a leer no existe.");
        }

        try {
            fich = new FileInputStream("turismos.dat");

            // A partir del fichero anterior se crea el flujo para leer objetos
            // Estructura try-with-resources
            try (ObjectInputStream flujo = new ObjectInputStream(fich)) {

                Vehiculo a;
                while (fich.available() > 0) {
                    // Se hace un casting explícito del objeto devuelto
                    // por readObject()
                    a = (Vehiculo) flujo.readObject();
                    // Añade el objeto a la lista
                    listaV.add(a);
                }

            } catch (ClassNotFoundException | IOException e) { // Multicatch
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("EL fichero a leer no existe.");
        }
        
        try {
            fich = new FileInputStream("deportivos.dat");

            // A partir del fichero anterior se crea el flujo para leer objetos
            // Estructura try-with-resources
            try (ObjectInputStream flujo = new ObjectInputStream(fich)) {

                Vehiculo a;
                while (fich.available() > 0) {
                    // Se hace un casting explícito del objeto devuelto
                    // por readObject()
                    a = (Vehiculo) flujo.readObject();
                    // Añade el objeto a la lista
                    listaV.add(a);
                }

            } catch (ClassNotFoundException | IOException e) { // Multicatch
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("EL fichero a leer no existe.");
        }

        System.out.println("--------------------------------------------------------");
        for (Vehiculo vehiculo : listaV) {
            System.out.println(vehiculo);
        }
        
        System.out.println("Lista ordenada por bastidor");
        
        Collections.sort(listaV, (v1,v2)->v1.getBastidor()-v2.getBastidor());
        for (Vehiculo vehiculo : listaV) {
            System.out.println(vehiculo.toStringFichero());
        }
        
        System.out.println("Borrar los archivos originales");
        
        Path element = Paths.get("furgonetas.dat");
        Path element2 = Paths.get("turismos.dat");
        Path element3 = Paths.get("deportivos.dat");
        try {
            Files.delete(element);
            Files.delete(element2);
            Files.delete(element3);
        } catch (IOException e) {
            System.out.println("Problema borrando el archivo.");
            System.out.println(e.toString());
        }
        
        System.out.println("");
        System.out.println("Mostrar contenido de la carpeta");
        File f2 = new File("C:\\Users\\Javier\\Documents\\NetBeansProjects\\Unidad8Casa");
        if (f2.exists()){
            File[] ficheros = f2.listFiles();
            for (File file2 : ficheros) {
                System.out.println(file2.getName());
            }
             }else {    System.out.println("El directorio a listar no existe");
        }


    }

}
