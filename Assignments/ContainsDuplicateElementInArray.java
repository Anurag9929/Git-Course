package Assignments;

public class ContainsDuplicateElementInArray {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 4, 1, 9 };
        boolean duplicatesFound = false;
        int num;
        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if ((i != j && num == arr[j]))
                    duplicatesFound = true;
            }
        }
        System.out.println(duplicatesFound);
    }

}
