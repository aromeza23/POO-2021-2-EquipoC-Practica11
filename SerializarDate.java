/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop11;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.io.FilterOutputStream;

/**
 *
 * @author ahanb
 */
public class SerializarDate {
    SerializarDate(){
        Date d = new Date ();
        System.out.println(d);
        try{
            FulrOutputStream f = new FileoutputStream ("data.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(d);
            s.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
            
            
    public static void main (String args[]) {
        SerializeDate serializeDate = new SerializeDate();
    }

    private static class SerializeDate {

        public SerializeDate() {
        }
    }
}
