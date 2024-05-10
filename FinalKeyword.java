// Theory: A final keyword can be used with variables,methods and class.A final variable becomes constant(value can't
// be changed once assigned any value,A final method can't be override,and a final class can't be inherited by other child classes)
// To stop method overriding, we make method as final.
// To stop extending class ,we make class as final.
final class A{

    public void show(){
     System.out.println("inside A show methods");
    }
    public void add(int num1,int num2){
        System.out.println(num1+num2);
    }
}


// class B extends A{} // not ALLOWED as final class can't be inherited


class C{
 public final void glow(){
    System.out.println("glow from class C");
 }

}

class D extends C{
    // public final void glow(){                        // NOT ALLOWED as we can't override final methods
    //     System.out.println("glow from class C");
    //  }
}
public class FinalKeyword {

    public static void main(String args[]){


        //  FINAL VARIABLE
         final int b = 14;
        // b= 12;  NOT ALLOWED TO reassign any value(it becomes constant)
        System.out.println(b);


        // FINAL METHOD
        A a = new A();
        a.show();
        a.add(23,23);
    }
    
}
