/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop11;

/**
 *
 * @author ahanb
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;  
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
        
public class ClaseFileWrite {
    public static void main (String [] leer ){
        String texto = "archivo.txt";
        try{
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Hola mundo 2");
            texto = br.readLine();
            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            try (PrintWriter salida = new PrintWriter(bw)) {
              
            }
        }catch(IOException ioe){
            System.out.println("\n\nError al abrir o guardar el archivo");
        }catch(Exception e){
            System.out.println("\n\n Error al leer el teclado");
        }
    }
}
