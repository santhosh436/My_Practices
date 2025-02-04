import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array Before removed duplicates: " + Arrays.toString(arr));
        int length = removeDuplicates(arr);

        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int removeDuplicates(int[] arr){
        int uniqueCount = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[uniqueCount]){
                uniqueCount++;
                arr[uniqueCount] = arr[i];
            }
        }
        return uniqueCount;

    }
}
