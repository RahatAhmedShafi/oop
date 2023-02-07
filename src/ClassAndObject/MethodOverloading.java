
package ClassAndObject;


public class MethodOverloading {
    void add(){
        System.out.println("No Information");
    }
    void add(String name,int age ){
        System.out.println("Name:"+name+"\n"+"Age:"+age);
    }
    void add(String Name,int Age,int phon){
        System.out.println("Name:"+Name+"\n"+"Age:"+Age+"\n"+"Phone:"+phon);
    }
    
    
}
