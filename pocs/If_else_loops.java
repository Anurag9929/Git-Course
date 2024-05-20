public class If_else_loops {

    public static void main(String args[]){
        int age = 21;

        if(age>=21){
            System.out.println("You are allowed to drive");

        }else if(age<21){
            System.out.println("You are not allowed for driving");

        }

        // SWITCH
        int dayNo=4;
        switch(dayNo){
            case 0:{
                    System.out.println("Sunday");
                    break;
            }
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{ 
                System.err.println("Saturday");
                break;
            }
            default:{
                System.out.println("Enter a correct No");
            }
        }

//  DO WHILE LOOP
int i=0;
 do{
    System.out.println("DO while loop");
    i++;
 }while(i<3); 
 i=0; 
 
//  While loop

 while(i<4){
    System.out.println("While loop");
    i++;
 }
 

//  FOR LOOP:
 for(int j=0;j<5;j++){
    System.out.println("Hello For Loop");
 }

//  BREAK: It is used to jump out of switch statement,loop like shown below
for (int q = 0; q < 10; q++) {
    if (q==10) {
        break;
    }
    System.out.println(q);
  }
// CONTINUE: The continue statement breaks one iteration (in the loop), 
//           if a specified condition occurs, and continues with the next iteration in the loop.

for (int s = 0; s < 10; s++) {
    if (s == 4) {
      continue;
    }
    System.out.println(s);
  }
    

}
    
}
