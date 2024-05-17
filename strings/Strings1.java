package strings;

public class Strings1 {
    public static void main(String[] args) {
        String st1= new String("Anurag");
        st1.concat("Shukla");
        System.out.println(st1); //Anurag

        StringBuffer sb1 =new StringBuffer("Anurag");
        sb1.append("Shukla");
        System.out.println(sb1); //AnuragShukla
    }
    
}
