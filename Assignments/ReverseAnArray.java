package Assignments;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[]={3,5,4,1,9};
        int arr1[]=new int[arr.length];
        int p=0;
        for(int i=arr.length-1;i>=0;i--){
            arr1[p]=arr[i];
            p++;

        }
        for(int k:arr1){
            System.out.print(k);
        }

    }    
}
