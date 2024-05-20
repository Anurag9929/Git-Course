package Assignments;

public class MinAndMaxElementInArray {
    public static void main(String[] args) {
        int arr[]={3,5,4,1,9};
        int max=arr[0];
        int min = max;
        for(int i=0;i<arr.length;i++){
            if ((max<arr[i])) {
                max=arr[i]; 
            }
        }
        for(int i=0;i<arr.length;i++){
            if ((min>arr[i])) {
                min=arr[i];
            }
        }
        
        System.out.println("Min:"+min+"Max:"+max);
    }
    
}
