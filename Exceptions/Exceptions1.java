// The code which is in try block just after the exception statement will not execute.
/*try{
    risky code
}catch(){
    handling code
}
finally{
    100% executable code
} */

package Exceptions;

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            // int a=2;
            // int b=10;
            //  double c =2/0;
            // int d=10/2;
            // int e=100;
            System.out.println("stnt 1");
            System.out.println("stmt 2");
            double c =2/0;
            System.out.println("stmt 3");
            System.out.println("stmt 4");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("catch 1");
            System.out.println("catch 2");
        }
        finally{
            System.out.println("finally block 1");
            System.out.println("finally block 2");
        }
    }
}
