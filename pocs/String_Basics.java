// String in java is class  which holds collection of Characters.It is immutable 
// means it's value can't be changed. 
//  Why are we not using new with string variable creations.
// String objects are created inside an special memory area inside heap memory and it is 
// called String constant pool.When are creating any var/obj it check in the memory pool
//do we have this data(if then new obj will not be created only reference will be changed
// or else it will create in the memory).
// If we want to use Mutable string we can use either String Buffer/Builder


public class String_Basics {
    public static void main(String args[]){
        String name= new String("Anurag");
        String s1 ="Anu";
        String s2 ="Anu";
        if (s1==s2) {
            System.out.println("Same value");
            
        }
        if(s1.equals(s2)){
            System.out.println("All same");;

        }

    }
    
}
