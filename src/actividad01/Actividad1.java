/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Actividad1 {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (100*(i+1))+j;
            }
        }
        
        String ficheroM = "array.txt";
        
        try (BufferedWriter flujo = new BufferedWriter (new FileWriter(ficheroM))){
            
            for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                flujo.write(matriz[i][j]+"\t");
            }
                flujo.write("\n");
        }
            flujo.flush();
            
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }   
        
        
        String line;
        
        System.out.println("Leer fichero - "+ficheroM);
        
        try (Scanner datosFichero = new Scanner(new File(ficheroM))){
            
            while (datosFichero.hasNextLine()){
                line = datosFichero.nextLine();
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
    
        
    
    
}
