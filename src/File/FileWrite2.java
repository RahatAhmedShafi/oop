/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;


import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;



/**
 *
 * @author ASUS
 */
public class FileWrite2 {
    public static void main(String[] args) {
        try{
            FileWriter f=new FileWriter("D:/JAVA21/oop/src/File/Student.txt");
            PrintWriter pw=new PrintWriter(f);
            pw.println("Hello");
            pw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
       
       
    }
    
}
