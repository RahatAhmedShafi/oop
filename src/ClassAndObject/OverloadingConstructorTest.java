
package ClassAndObject;


public class OverloadingConstructorTest {
    public static void main(String[] args){
        OverloadingConstructor TT=new OverloadingConstructor();
         OverloadingConstructor TT2=new OverloadingConstructor("Rahat","male");
         TT2.displayInformation();
             
         OverloadingConstructor TT3=new OverloadingConstructor("Ahmed","Male",123456);
         TT3.displayInformation();
    }
    
}
