
package MethodOverriding;


public class Test {
    public static void main(String[] args) {
        SecondPerson dd=new SecondPerson();
        dd.Name="Shafi";
        dd.age=22;
        dd.qualification="HSC";
        dd.display(); 
        Person tt=new Person();
        tt.Name="Pavel";
        tt.age=22;
        tt.display();
    }
}
