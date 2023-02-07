
package Static_keyword;


public class Student {
    
    String name;
    int id;
   static String UniversityName="UIU";
    
    Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("UniversityName:"+UniversityName);
        
    }
}
