import java.util.Arrays;
import java.util.Scanner;

public class FindKthSmallestValue {
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
        System.out.print("Enter the Kth Value: ");
        int k = scanner.nextInt();
        System.out.print("The "+k+"th smallest values is: "+ findKthSmallestValue(arr,k));
    }
    public static int findKthSmallestValue(int[] arr,int k){
        int uniqueCount = 0;
        int firstNum = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j != firstNum) {
                uniqueCount++;
                if (uniqueCount == k) {
                    return j;
                }
            }
            firstNum = j;

        }
        return -1;
    }
}
