package CollectionsConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ArrayList_Arrays {
    public static void main(String[] args) {

        //creation
        String[] frnd = {"A","B","C"};
        ArrayList <Integer>list = new ArrayList<>();
        ArrayList <String>list1 = new ArrayList<String>();
        ArrayList<String>friendList1 = new ArrayList<>(Arrays.asList("Anurag","Atul","Viki","Suresh"));
        
        //get an element
        System.out.println(frnd[0]); 
        System.out.println(friendList1.get(0));

        //check size/length
        System.out.println(frnd.length);
        System.out.println(friendList1.size());

        // You can't add more elements in an array
        friendList1.add("Shivam");
        friendList1.add(0, "Satyendra");
        System.out.println(friendList1);


        // set an element
       frnd[0]="E";
       friendList1.set(0, "Anurag Shukla");
       System.out.println(friendList1+":    "+frnd[0]);

    //    Remove an element
     // we can't do this for array
     friendList1.remove(1); 
     friendList1.remove("Viki"); 
     System.out.println(friendList1);

     //Print
     System.out.println(frnd);  // getting memory address
     System.out.println(friendList1);

     //loops
     for(int i=0;i<friendList1.size();i++){
        System.out.println(friendList1.get(i));
     }

     //sorting
     Collections.sort(friendList1);
     System.out.println(friendList1);

    }

    
}