//Encapsulation: Means keep it close/tight/together so that no one can use it from outside.
// no one can see your data,if they want ,then they need to ask.
// we must control who can access our data from outside world ,and for that we make variables private 
// EveryTime we create an instance variable make it private so, 
// outside people can access these variable indirectly using methods(getters and setters are used to
//  to get and set the values respectively)

//  So basically binding data and methods ,the only way to access the data from outside world
// is using methods only .This is called encapsulation.


package OOPS;
class Human{
    String userName="abc@gmail.com";
    private String password ="dvfvfb";
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    
}

public class EncapsulationBasic {
    public static void main(String[] args) {
        Human obj=new Human();
        // obj.userName="abc@gmail.com";
        // obj.password="dvfvfbf";
        // System.out.println(obj.userName);
        // System.out.println("UserName_"+obj.getUserName()+",Password- "+obj.getPassword());
        obj.setUserName("SHukla_23232@gmail.com");
        obj.setPassword("Hey Hello");
        System.out.println("UserName_"+obj.getUserName()+",Password- "+obj.getPassword());
    }
    
}
