
package File;

import java.util.Formatter;


public class Example2 {
    public static void main(String[] args){
        try{
            Formatter formatter=new Formatter("D:/JAVA21/oop/src/File/Person/Student.txt");
            formatter.format("%s %s\r\n","101","Rahat" );
            formatter.format("%s %s\r\n","102","Ahmed" );
            formatter.format("%s %s\r\n","103","Shafi" );
            formatter.close();
        }
        catch(Exception e){
            System.out.println(e);
            
        }
    }
}
