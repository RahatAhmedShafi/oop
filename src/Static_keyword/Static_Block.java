
package Static_keyword;


public class Static_Block {
    
    static String name;
    static int id;
    
    static{
        name="Rahat";
        id=201;
    }
    static void display(){
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
    }
}
