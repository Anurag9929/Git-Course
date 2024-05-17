// Polymorphism: Having Many behaviours on difference situations:
// Types: Compile time(also called early binding) and runtime polymorphism(late binding)
// If the behaviour is defined at compile time or else behaviours is defined at run time.
// :Overloading is part of compile time and overriding is a part of run time.
// Overloading: We can have same method name but different params/no of params/types of params.
package OOPS;

class Calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double n1,int n2){
        return n1+n2;
    }

}

public class Polymorphism_Overloading {
    public static void main(String[] args) {
        Calculator c= new Calculator();
        int s = c.add(23, 21);
        System.out.println(s);
        int s1 = c.add(23, 21,43);
        System.out.println(s1);
        double s2 = c.add(23.9833, 21);
        System.out.println(s2);
    }
    
}
