package Assignments;

public class GetUniqueElementsFromArrayElements {
    public static void main(String[] args) {
        int arr[] ={2,3,4,4,35,67,65,1,1,9,3};
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if (arr1[j]!=arr[j]) {
                    System.out.println(arr[j]);
                    arr1[j]=arr[j];
                }
            }
        }
     
    }
    
}
