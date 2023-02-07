package File;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("D:/JAVA21/oop/src/File/Person/Student.txt");
            Scanner sc=new Scanner (file);
            while(sc.hasNext()){
                String id=sc.next();
                String name=sc.next();
                System.out.println("Id:"+ id+" "+"Name:"+name);
            }
            sc.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
