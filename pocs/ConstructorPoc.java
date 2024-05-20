public class ConstructorPoc {

    public ConstructorPoc(){
        System.out.println("Constructor called");
    }

    public ConstructorPoc(int a, int b){
        System.out.println("2 argument Constructor called");
    }

    public ConstructorPoc(int a, int b,int c){
        System.out.println("3 argument Constructor called");
    }

    
    public static void main(String a[] ){
        ConstructorPoc cd  = new ConstructorPoc();
        ConstructorPoc cd2 = new ConstructorPoc(5,6);
        ConstructorPoc cd3  = new ConstructorPoc(15,26,33);
    }
       


    }