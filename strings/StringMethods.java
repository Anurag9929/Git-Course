package strings;

public class StringMethods {
    public static void main(String[] args) {
        String var1 = new String("India");
        System.out.println(var1.charAt(0));
        System.out.println(var1.substring(3));  // from 3 to last
        System.out.println(var1.substring(0,2));  // excluding 2
        System.out.println("Anurag".equals("anurag"));
        System.out.println("Anurag".equalsIgnoreCase("anurag"));
        System.out.println("   Hello world    ".trim());
        System.out.println("Anurag".replace("A", "PA"));
        System.out.println("anurag".contains("a"));
        System.out.println("anurag".startsWith("a"));
        String str1="ABDJDJDJDJDJDD";
        System.out.println("Length of the String is"+str1.length());
        String firstName="anurag";
        System.out.println(firstName.toUpperCase());
        String  lastName="SHUKLA";
        System.out.println(lastName.toLowerCase());
        System.out.println("My Name is Anurag Shukla".indexOf("Anurag"));  // will return index of A in Anurag
        System.out.println(firstName+" "+lastName+"Using concat method:---"+firstName.concat(lastName));
        System.out.println("Hope \'Anurag\' is going to \"Indore\" \\soon");

    }
    
}
