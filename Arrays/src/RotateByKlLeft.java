import java.util.Arrays;
import java.util.Scanner;
/*
Reverse the entire array.
Reverse the first k elements.
Reverse the remaining n-k elements.
*/

public class RotateByKlLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the K Value: ");
        int k = scanner.nextInt();
        rotateByLeft(arr,k);
        System.out.println(Arrays.toString(arr));

    }
    public static void rotateByLeft(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void reverse(int[] arr,int start,int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
