// Difference between String and StringBuffer == Operator Vs equals method
// ==: It returns true only when 2 references are pointing to the same object or else gives false.
//equals():It is a method of Object class where it is used for reference/address comparison only.
// But String and StringBuffer both class overrides equals() methods of object class.
// So equals() in String class is used to comparison contents only.
// And equals() in Str

package strings;

public class String2 {
    public static void main(String[] args) {
//  Case1:       
        String s1 = new String("Anurag");
        String s2 = new String("Anurag");
        System.out.println(s1==s2);         //false: It check only reference address
        System.out.println(s1.equals(s2));  // true:check only content

        StringBuffer sb1 = new StringBuffer("Atul");
        StringBuffer sb2 = new StringBuffer("Atul");
        System.out.println(sb1==sb2);  // false: It compare address here 2  diff objects will be created
        System.out.println(sb1.equals(sb2));
    }
    
}
