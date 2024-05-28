package Exceptions;

public class Exception3 {
    public static void main(String[] args) {
        int a =20;
        // int a =0;
         int b=0;
        try{
            b=18/a;                     
            if(b==0){
                throw new Exception("Hi Anurag");   
            }                            
        }catch(Exception e){              
            System.out.println("that" +e);
    }

} 
}