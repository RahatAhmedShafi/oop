
package MethodOverriding;


public class SecondPerson extends Person {
    
    String qualification;
    @Override
    void display(){
        System.out.println("Name:"+Name);
        System.out.println("Age"+age);
        System.out.println("Qualification:"+qualification);
    }
}
