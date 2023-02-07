/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassAndObject;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ArrayEx2 {
    
        /* public void arrayelement(int[] myArray){
        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }
        
    }
*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int colm=sc.nextInt();
        int number[][]=new int[row][colm];
        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
                number[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
                System.out.print(number[i][j]+"");
            }
            System.out.println("");
        }
            
        
         
    }   
    
    }
   
    
    

    
       
    
    
