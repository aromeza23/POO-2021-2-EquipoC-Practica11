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
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeeTecladoCompleto {
    public static void main (String[] leer ){
        String texto = "";
        try {
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribir Texto:");
            texto = br.readLine();
            
            System.out.println("\n\n El texto separado por espacios es:");
            StringTokenizer st= new StringTokenizer(texto);
            while (st.hasMoreTokens()){
                System.out.println(st.nextToken());
            }
        }catch (IOException e){
            System.out.println("\n\nError al leer de teclado");
            e.printStackTrace();
        }
    }
    
}
