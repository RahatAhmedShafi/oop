
package Thread11;


public class Sleep implements Runnable {
    public void run(){
        int i=1;
        while(i<=10){
            System.out.println("i"+i);
            i++;
            try{
                Thread.sleep(300);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
    public static void main(String[] args) {
        Sleep t=new Sleep();
        Thread thread1=new Thread(t);
         Thread thread2=new Thread(t);
         
          thread1.start();
          thread2.start();
          
          
        
    }
}
