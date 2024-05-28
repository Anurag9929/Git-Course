package Exceptions;

public class Exceptions4 {
    public static void main(String[] args){
        // Class.forName(Aclaa);
        Exceptions4.add(12,2);
        Exceptions4.div(2,3);
        // Exceptions4.add(12,0);
    }
    public static void add(int num1,int num2){
        int c=0;
        try {
            c= num1/num2;
        } catch (Exception e) {
            System.out.println("exception handling-"+c);
        }
        System.out.println("from add-"+c);
        // return c;
     }
         public static void div(int a,int b){
            int c =0;
        try {
            c=a/b;
        } catch (Exception e) {
            throw e;
        }
        System.out.println("from mul-"+c);
        // return c;
     }

}
    

