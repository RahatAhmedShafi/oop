package Exception;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int age=sc.nextInt();
            if(age>=18){
                System.out.println("Yes for voting");
            }
            else{
                throw new UserException(age);
            }
        }
        catch(UserException e){
            System.out.println(e);
        }
    }
  

}
