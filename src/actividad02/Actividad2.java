/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Actividad2 {

    public static void main(String[] args) {

        String fichero2 = "teclado.txt";
        String tmp;
        Scanner tec = new Scanner(System.in);

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(fichero2))) {

            do {
                tmp = tec.nextLine();

                if (!tmp.contains("EOF")) {
                    flujo.write(tmp);
                    flujo.write("\n");
                }

            } while (!tmp.contains("EOF"));

            flujo.flush();
            
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        
        System.out.println("Leer fichero - "+fichero2);
        
        try (Scanner datosFicheros = new Scanner(new File(fichero2))){
            
            while(datosFicheros.hasNextLine()){
                tmp = datosFicheros.nextLine();
                System.out.println(tmp);                
            }
            
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }

    }

}
