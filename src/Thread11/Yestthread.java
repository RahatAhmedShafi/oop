
package Thread11;


public class Yestthread extends Thread {
    
    public int Id;

    public Yestthread(int Id) {
        this.Id = Id;
    }
    public void run(){
        try{
            System.out.println("Thread class object "+Id);
        }
        catch(Exception e){
            
        }
    }
}
