/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;


public class Rectangle extends Shape {
    
    Rectangle(double dim1,double dim2){
       super(dim1,dim2);
   }
   void area(){
       double result=dim1*dim2;
       System.out.println("RectangleArea:"+result);
   }
}
