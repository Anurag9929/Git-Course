final class A{
     int num1,num2;
     final double pi = 3.41;
    public int add(int a,int b){
        return a+b;
    }
    // Can't change a final variable value as it becomes a constant
    // pi= 23.33;
}
// We can't extend a Final class that's why getting error in the below line
// class B extends A{
//     public int sub(int a,int b){
//         return b-a;
//     }
//     public final int mul(int a,int b){
//         return a*b;
//     }
// }
// not allowed to override a final method as shown below
// class C extends B{
//     // public int mul(int a,int b){    
//     //     return a*b;
//     // }

// }

public class Final_cls_method_var{
    public static void main(String args[]){
        A a = new A();
        // a.pi= 12.23;
    }
    
    
}
