package Arrays;
public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int arr[] ={2,3,4,4,35,67,65,1,1,9,3};
        // int arr[]={1,2,3,1};
        // for(int i=0;i<a.length;i++){
        //     int count =0;
        //     for(int j=0;j<a.length;j++){
        //         if(a[j]==a[i]) count++;
        //     }  
        //     if(count==1){
        //         System.out.println(a[i]);
        //     }
        //     }



        for (int i = 0; i < arr.length; i++)
		{
			// Check if the picked element 
			// is already printed
			int j;
			for (j = 0; j < i; j++)
			if (arr[i] == arr[j])
				break;
	
			// If not printed earlier, 
			// then print it
			if (i == j)
			System.out.print( arr[i] + " ");
		}
    //     int a[]={1,2,3,1};
    //     for(int i=0;i<a.length;i++){
    //         for(int j=0;j<a.length;j++){
    //            if (i==j) {
    //             continue;
                
    //            }else if(a[j]!=a[i]){

    //            }
    //         }
    //     }

    }
    
}
