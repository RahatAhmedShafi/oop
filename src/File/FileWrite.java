/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File_Handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Admin
 */
public class FileWrite {
    public static void main(String[] args) {
        try{
            //non-append mode
          //  File f=new File("D:\\Student\\student.txt");
            //append mode
            FileWriter f=new FileWriter("D:\\JAVA21\\oop\\src\\Filestudent.txt", true);
            PrintWriter pw=new PrintWriter(f);
            pw.println(123);
            pw.println(3.55);
            pw.println("abc");
            
            Student s1=new Student(101, "ABC", 3.50);
            pw.println(s1.id+" "+s1.name+" "+s1.cgpa);
            
//            BufferedWriter bw=new BufferedWriter(f);
//            bw.write(97+"");
//            
//            
//            bw.close();
            pw.close();
            
        }catch(Exception e){
            System.out.println(e);   
        }
    }
}
