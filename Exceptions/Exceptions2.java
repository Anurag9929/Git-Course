
package Exceptions;
public class Exceptions2 {
    
  
        public static void main(String[] args) {
           // try{
            int i=0;
            int j=0;
            try{
                 j=18/i;
                 System.out.println("Hello Ji");
                 if (j==0) {
                    // throw new ArithmeticException ("exception");
                    throw new Exception ("exception");
                 }
                 
            }
          
        // catch(ArithmeticException e)
        // {
        //     System.out.println("catch block will be run if there will be an exception");
        // }
        catch(Exception e)
        {
            System.out.println("catch block will be run if there will be an exception" +e);
        }
    finally{
        System.out.println("Hi");
    }

}
        }