
package ClassAndObject;

import java.util.Scanner;


public class ArrayExample {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
        
        for(int i=0;i<size;i++)
        {
            number[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0;i<number.length;i++)
        {
            if(number[i]==x)
            {
                System.out.println("Index:"+i);
            }
        }
        
       // for(int i=0;i<size;i++)
       // {
        //    System.out.println(number[i]);
       // }
        
        
        
        //int[] marks=new int[3];
        //marks[0]=96;
       // marks[1]=94;
       // marks[2]=92;
        //System.out.println("marks:"+marks[0]);
       // System.out.println("marks:"+marks[1]);
        //System.out.println("marks:"+marks[2]);
      //  for(int i=0;i<3;i++)
       // {
      //      System.out.println(marks[i]);
       // }
    }



    
}
