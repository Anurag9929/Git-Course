package OOPS;
class Parent {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.add();
        p.subtract();

        Child c = new Child();
        c.add();
        c.subtract();
        c.multiply();
        c.divide();

        Parent p1 = new Child();
        p1.add();
        p1.subtract();

        // Child c1 = new Parent();



    }

    public void add(){
        System.out.println("Add method is running");
    }

    public void subtract(){
        System.out.println("Subtract method is running");
    }


}
 class Child  extends Parent{
    public void multiply(){
        System.out.println("multiply method is running");
    }

    public void divide(){
        System.out.println("divide method is running");
    }


}


