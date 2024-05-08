 class Addition{
    public int add(int a,int b){
        return a+b;
    }
    
}
 class Subtraction extends Addition{
    public int sub(int a,int b){
        return b-a;
    }
    
    
}
 class Multiplication extends Subtraction{
    public int mul(int a,int b){
        return a*b;
    }
    
    
}
 class Division extends Multiplication{
    public double div(double a,double b){
        return b/a;
    }
    
    
}

public class Calculator{
    
    public static void main(String ar[]){
        Addition a = new Addition();
        System.out.println("Calling by Addition Object: "+"Add method:"+a.add(12, 13));
        Subtraction s = new Subtraction();
        System.out.println("Calling By Object of Subtraction Class: "+"Add method:"+s.add(99, 1)+" ,Subtract Method:"+s.sub(98, 3));

        Multiplication m = new Multiplication();
        System.out.println("Calling By Object of Multiplication Class: "+"Add method:"+m.add(1, 2)+
        ",Subtraction Method:"+m.sub(2, 3)+",Multiplication Method:"+m.mul(3, 5));
        
        
        Division d = new Division();
        System.out.println("Calling By Object of Division Class: "+"Add method:"+d.add(1, 2)+
        ",Subtraction Method:"+d.sub(2, 3)+",Multiplication Method:"+d.mul(3, 5)+",Division method:"+d.div(5, 50));
    }
}