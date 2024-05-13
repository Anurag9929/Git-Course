// Array is non primitive data types which holds multiple values of same data types.It's like a tray
// which holds multiple cups.Once we defined size of an array we can not change it.
// how to declare an array:
// 1): int a[]={1,2,3,4}; declaration + assignment also
// 2): int b[]=new int[5]; declaration with size
package Arrays;
public class ArraysConcepts {

    public static void main(String args[]){
        int num[]={3,4,5};
        // System.out.println(num[1]);
        num[1]=12;

        int []num1= new int[4];
        num1[0]=0;
        num1[1]=1;
        num1[2]=2;
        num1[3]=3;
        
        // for(int i=0;i<=3;i++){
        //         System.out.println(num1[i]);
        // }

        // Multi Dimensional Array
        int two_D_Array[][]=new int[3][4];
        for(int j=0;j<=2;j++){
            for(int k=0;k<=3;k++){
                two_D_Array[j][k]=k;
            }
        }
        // for(int l=0;l<=2;l++){
        //     for(int m=0;m<=3;m++){
        //         System.out.print(two_D_Array[l][m]);
        //     }
        //     System.out.println();
        // }

        for(int n[]:two_D_Array){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        
        }

        // Jagged Array:Those arrays which are having different sizes of internal arrays.
        // here we need to specify individually for the columns 
        int jaggedArray[][]=new int[3][]; // Jagged Array
        jaggedArray[0] =new int[4];
        jaggedArray[1] =new int[3];
        jaggedArray[2] =new int[2];

        for(int s=0;s<jaggedArray.length;s++){
            for(int t=0;t<jaggedArray[s].length;t++){
                jaggedArray[s][t]=(int)(Math.random() * 10);

            }
        }
        for(int u[]:jaggedArray){
            for(int v:u){
                System.out.print(v);
            }
            System.out.println();
        }
    }
    
}
// Drawback of Array:
// Array in java is an object which will be created in the heap memory.And it will take continuos 
// memory,due to which in future we can't increase the size.
// 2: For searching and inserting it is not good.
// 3: We can't have an array which holds different data type values.