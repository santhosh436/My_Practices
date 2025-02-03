import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
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
        insertionSort(arr);
        System.out.println("Array After Sorted: "+Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
