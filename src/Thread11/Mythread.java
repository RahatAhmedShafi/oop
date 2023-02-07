/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread11;

/**
 *
 * @author ASUS
 */
public class Mythread implements Runnable{
    public void run(){
        int i=1;
        while(i<=10){
            System.out.println("i"+i);
            i++;
        }
    }
    public static void main(String[] args) {
        Mythread t = new Mythread();
        Thread th1=new Thread(t);
        Thread th2=new Thread(t);
        
        th1.start();
        th2.start();
       
        
        
    }
}
