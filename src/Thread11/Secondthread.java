
package Thread11;


public class Secondthread extends Thread {
    public int Id;

    public Secondthread(int Id) {
        this.Id = Id;
    }
    @Override
    public void run(){
        try{
            System.out.println("Thread class object "+Id);
        }
        catch(Exception e){
            
        }
    }
    
  
    /*public void run(){
        try{
            System.out.println("Thread interface object "+Thread.currentThread().getId());
        }
        catch(Exception e){
            
        }
        
    }
*/
}
