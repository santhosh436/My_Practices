import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromUnsortedArray {
    public static void main(String[] args) {
        // Bubble sorting and two pointer approach.
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
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static int removeDuplicates(int[] arr){
        int n = arr.length;
        bubbleSort(arr);
        int uniqueCount = 1;
        for(int i=1;i<n;i++){
            if(arr[i] != arr[i-1]){
                arr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
