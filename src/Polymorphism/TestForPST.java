
package Polymorphism;


public class TestForPST {
    public static void main(String[] args) {
        
          Person p= new Person();
          p.display();
          p=new Teacher();
          p.display();
          p=new Student();
          p.display();
          Teacher t=new Teacher();
          t.display();
          Person a=new Teacher();
          a.display();
    }
  
    
    
}
