//  When we create an object of a class ,it will call the constructor of sub-class and super call both
// why the constructor of parent class is called?
//Ans:Every constructor in java, the first statement is super method, there even if don't mention there and
//  which is responsible to call the super class constructor,by default it will call default constructor,
// to call parametrized constructor of super class, we need to pass param explicitly.
// Every class in java extends Object class(even if we don't mentioned)

class A extends Object{ // this extends is hidden

    public A(){
        super();  // its always there hidden
        System.out.println("in A");
    }
    public A(int n){
        super();  // its always there hidden
        System.out.println("in A param");
    }
}
class B extends A{
    public B(){
        super();  // its always there hidden
        System.out.println("in B");
    }
    public B(int n){
        // super();  // its always there hidden
        super(n); // to calll the parametrized constructor of super class.
        System.out.println("In B Param");
    }

}

public class SuperMethod {

    public static void main(String args[]){
        B obj = new B();
        // B obj = new B(2);
    }
    
}
