/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop11;

/**
 *
 * @author Ing.Alejandro.Romero.Zamora
 */
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStream {
    
    public static void main (String [] args) {
        FileOutputStream fos = null;
        byte[] buffer = new byte[81];
        int nBytes;
        try {
            System.out.println("Hola mundo");
            nBytes = System.in.read(buffer);
            fos = new FileOutputStream("fos.txt");
            fos.write(buffer,0,nBytes);
        } catch (IOException ioe){
            System.out.println("Error:  " + ioe.toString());
        } finally {
            try {
                if (fos ! = null) fos.close();
            } catch (IOException ioe ){
                System.out.println("Error al cerrar el archivo.");
            }
        }
            
        
    }
    
}
