package OOPS;

class Addition{
    int num1,num2;
   public int add(int num1,int num2){
    this.num1 = num1;
    this.num2 = num2;
    return this.num1+this.num2;
   }
   }
   class Subtraction extends Addition{
    int num1,num2;
   public int sub(int num1,int num2){
    this.num1 = num1;
    this.num2 = num2;
    return this.num2-this.num1;

   }
}

public class InharitanceBasic {

    public static void main(String[] args) {
        Subtraction s = new Subtraction();
        System.out.println(s.add(12, 23)+" "+s.sub(50, 11));
        
        
    }
    
}
