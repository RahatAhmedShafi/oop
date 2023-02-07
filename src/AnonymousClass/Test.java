
package AnonymousClass;


public class Test {
    public static void main(String[] args) {
        Person p=new Person(){
            public void display(){
                System.out.println("Hi I am Shafi");
            }
           
        };
         p.display();
    }
}
