package Exceptions;
class Caculator{
   
    public int callDiv(int a,int b){
        Division ad = new Division();
        int c=0;
    try {
        c= ad.div(a, b);
    } catch (Exception e) {
        System.out.println(e);
    }
    return c;
    
    }
    public int mul(int a,int b){
        return a*b;
    }
    
    

}
class Division{
    public int div(int a,int b)throws ArithmeticException {
        int c =0;
        return a/b;

            // try {
        //     c =a/b;
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        // return c;
    }
}

public class ExceptionThrows {
    public static void main(String[] args) {
        
        Caculator c = new Caculator();
       System.out.println( c.callDiv(12, 2));
       // Division a = new Division();
        // System.out.println(a.add(2, 0));
        // a.add(21, 0);
    }
    
}
