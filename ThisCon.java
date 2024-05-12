//  "this" is a keyword which represent current object which the object which is calling the method.
// It point the instance variables 

public class ThisCon{
     private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String args[]){
        ThisCon obj = new ThisCon();
        obj.setAge(30);
        obj.setName("Anurag Shukla");
        System.out.println("Age:"+obj.getAge()+",Name:"+obj.getName());

    }
}