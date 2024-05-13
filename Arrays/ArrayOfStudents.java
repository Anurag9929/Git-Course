package Arrays;
class Student{
    int rollNo;
    String name;
    int marks;
}

public class ArrayOfStudents {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.rollNo=1001;
        s1.name="Anurag";
        s1.marks = 100;

        Student s2 = new Student();
        s2.rollNo=1002;
        s2.name="Atul";
        s2.marks = 90;
        
        Student s3 = new Student();
        s3.rollNo=1003;
        s3.name="Anuj";
        s3.marks = 80;

        Student []students = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3; 

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].rollNo+" "+students[i].name+" "+students[i].marks);
        }
    }
    
}
