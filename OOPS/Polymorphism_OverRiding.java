// Polymorphism: Having Many behaviours on difference situations:
// Types: Compile time(also called early binding) and runtime polymorphism(late binding)
// If the behaviour is defined at compile time or else behaviours is defined at run time.
// :Overloading is part of compile time and overriding is a part of run time.
// Overloading: We can have same method name but different params/no of params/types of params.
// OverRiding: Having same name/same params/same type of params but different definition.So ,here we overriding the methods
//  of parent class.
package OOPS;
class A{
    public void show(){
        System.out.println("In SHOW from class A");
    }
    public void hide(){
        System.out.println("In Hide from class A");
    }
}
class B extends A{
    public void show(){
        System.err.println("In show from class B");
    }

}

public class Polymorphism_OverRiding {
    public static void main(String[] args) {
        B b = new B();
        b.hide();
        b.show();
    }
    
}
