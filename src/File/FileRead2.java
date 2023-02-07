/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author ASUS
 */
public class FileRead2 {
    public static void main(String[] args) {
       try {
           FileReader fr = new FileReader("D:/JAVA21/oop/src/File/Student.txt") ;
            BufferedReader r = new BufferedReader(fr);
            String str=r.readLine();
            while ( str != null ){
                System.out.println("Read:"+str) ;
                 
                 str=r.readLine();
            }
            r.close();

       }
       catch(Exception e){
           System.out.println(e);
       }
            
            
    }
    
}
