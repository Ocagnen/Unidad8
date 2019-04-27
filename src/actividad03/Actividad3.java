/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Actividad3 {

    public static void main(String[] args) {

        String fichero3 = "caracteres.txt";
        int tmp;
        Random rnd = new Random();

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(fichero3))) {

            for (int i = 0; i < 50; i++) {

                tmp = rnd.nextInt(122 - 97) + 97;

                if (rnd.nextInt(2) == 1) {
                    tmp = Character.toUpperCase((char) tmp);
                }

                flujo.write((char) tmp);

                if ((char) tmp == 'x' || (char) tmp == 'X') {
                    flujo.newLine();
                } else {
                   flujo.write(","); 
                }
                
                

            }

            flujo.flush();

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        String line;
        System.out.println("Leer fichero - "+fichero3);

        try (Scanner datosFicheros = new Scanner(new File(fichero3))){
            
            while(datosFicheros.hasNextLine()){
                line = datosFicheros.nextLine();
                System.out.println(line);
            }
            
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }
        
    }

}
