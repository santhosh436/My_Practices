import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the Sum Value: ");
        int sum = scanner.nextInt();
        moveZeros(arr);
        System.out.println("Array After moving the zeros: "+Arrays.toString(arr));

    }
    //moving the zeros to right side
    public static void moveZeros(int[] arr){
        int left = 0;
        int right = 0;
        int n = arr.length;
        while (right<n){
            if(arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
    }
    //moving the zeros to left side
    public static void moveZerosLeft(int[] arr) {
        int right = arr.length - 1, left = arr.length - 1;

        while (right >= 0) {
            if (arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left--;
            }
            right--;
        }
    }
}
