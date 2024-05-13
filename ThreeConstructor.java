

class A{
    int  age;
    String name;
    public A(){
        this(60);
        System.out.println("Default constructor in A Class");
    }
    public A(int age){
        this(10,"Arun Singh");
        System.out.println("one argu Parametrized constructor in A Class");
    }
    public A(int age,String name){
        System.out.println("two argu Parametrized constructor in A Class");
    }
}
class B extends A{
    int  standard;
    String schoolName;
    public B(){
        super();
        System.out.println("Default constructor in B Class");
    }
    public B(int standard){
        this();
        System.out.println("one argu Parametrized constructor in B Class");
    }
    public B(int standard,String schoolName){
        this(1);
        System.out.println("two argu Parametrized constructor in B Class");
    }
}

public class ThreeConstructor {
    public static void main(String args[]){
        B b = new B(6,"Anurag");
        System.out.println("Done");
        
    }
    
}

