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
import java.io. File;
import java.io. IOException;

public class CreateFile {
    public static void main(String[] args) {
    try {
           File archivo = new File("archivo.txt");
           System.out.println(archivo.exists());
           boolean seCreo = archivo.createNewFile();
           System.out.println(seCreo);
           System.out.println(archivo.exists());
       } catch(IOException e) {}
    }
    }
    

