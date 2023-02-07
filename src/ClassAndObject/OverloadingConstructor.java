
package ClassAndObject;


public class OverloadingConstructor {
    String name,Gender;
    int phoneNumber;
    
    OverloadingConstructor(){
        System.out.println("No Information");
        
    }
    OverloadingConstructor(String n,String G){
        name=n;
        Gender=G;
        
    }
     OverloadingConstructor(String na,String Ge,int p){
         name=na;
         Gender=Ge;
         phoneNumber=p;
         
        
     }
     void displayInformation(){
         System.out.println("Name:"+name);
         System.out.println("Gender:"+Gender);
         System.out.println("PhoneNumber:"+phoneNumber);
     }
    
}
