import java.util.Arrays;
import java.util.Scanner;
/*
How Selection Sort Works?
    Start with the first element and find the smallest element in the entire array.
    Swap the smallest element with the first element.
    Move to the second element, find the smallest element in the remaining array, and swap.
    Repeat the process until the array is fully sorted.
 */
public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the "+size+" elements:");
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array Before Sorted: "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Array After Sorted: "+Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]< arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
