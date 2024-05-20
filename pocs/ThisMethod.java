// this():It will execute the constructor of the same class.
// Every class in java extends Object class(even if we don't mentioned)

class A extends Object{ // this extends is hidden

    public A(){
        super();  
        System.out.println("in A");
    }
    public A(int n){
        super();  
        System.out.println("in A param");
    }
}
class B extends A{
    public B(){
        super(); 
        System.out.println("in B");
    }
    public B(int n){
        this(); 
        System.out.println("In B Param");
    }

}

public class ThisMethod
 {

    public static void main(String args[]){
        B obj = new B(3);
    }
    
}
