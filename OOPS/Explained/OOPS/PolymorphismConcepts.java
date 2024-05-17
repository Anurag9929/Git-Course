package OOPS.Explained.OOPS;
class Polymorphism{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return b-a;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return b/a;
    }
// OverLoading in the Same class
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int sub(int a,int b,int c){
        return (c-(b-a));
    }
   //Overriding in the same class
//    public int mul(int a,int b){
//     return b/a;
// }
// public int div(int a,int b){
//     return a*b;
// }
    
}
class Overloading extends Polymorphism{

    // OverLoading in the Child class
    public int mul(int a,int b,int c,int d){
        return d*(c*(a*b));
    }
    public int div(int a,int b,int c,int d){
        return d/(c/(b/a));
    }

}
class Overriding extends Polymorphism{
    public int add(int a,int b){
        return b-a;
    }
    public int sub(int a,int b){
        return b+a;
    }
   

}
public class PolymorphismConcepts {
    public static void main(String[] args) {
        Polymorphism p1 = new Polymorphism();
        System.out.println("Parent class:"+p1.add(2, 3)+"-"+p1.add(3, 1,21));
        Overloading chld1 = new Overloading();
        System.out.println("Overloading chid-"+chld1.mul(0, 0)+"-"+chld1.mul(3, 2, 1, 2));
        Overriding chld2 = new Overriding();
        System.out.println("Overriding child:"+chld2.add(23, 11)+"-"+chld2.add(3, 4, 5));
    }
    
}
