
package Thread11;


public class Myfirstthread {
    public static void main(String[] args) {
        
        for(int i=1;i<=10;i++){
            //Yestthread obj=new Yestthread(i);
            //obj.start();
            
           // Thread obg=new Thread(new Secondthread());
           // obg.setPriority(Thread.MIN_PRIORITY);
           // obg.start();
           
           Secondthread s=new Secondthread(i);
           s.start();
           
            
            
        }
    }
}
