package Exceptions;

class Calc{
    public int add(int a,int b){
        System.out.println("hi");
        return a+b;
    }

}

public class ClassLoaderConcepts {

public static void main(String[] args) {
    try {
        Class.forName("Exceptions.Calc");
    } 
    catch (Exception e) {
        // TODO: handle exception
        System.out.println("Hello"+e);
    }
}
    
}
