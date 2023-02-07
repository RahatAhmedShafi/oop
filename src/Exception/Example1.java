package Exception;

public class Example1 {

    public static void main(String[] args) {
        try {
            //  int x=4;
            // int y=0;
            // int div=x/y;
            int p[] = new int[4];
            p[7] = 10;

            //System.out.println("Result:"+div);
        } // catch(ArithmeticException e){
        //    System.out.println("Please Enter a valid input...");
        // }
        catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println(e2);

        } finally {
            System.out.println("Thanks for your valuable time:)");
        }
    }

}
