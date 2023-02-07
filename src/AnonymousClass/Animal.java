
package AnonymousClass;


public class Animal {
    public static void main(String[] args) {
        NewInterface d=new NewInterface(){
            public void people(){
                System.out.println("Rahat Ahmed Shafi");
            }
        };
        d.people();
    }
}
