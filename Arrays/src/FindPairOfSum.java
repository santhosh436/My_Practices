import java.util.Arrays;
import java.util.Scanner;

public class FindPairOfSum {
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
        findPairOfSum(arr,sum);
    }

    public static boolean findPairOfSum(int[] arr,int sum) {
        int n = arr.length;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int findSum = arr[left] + arr[right];
            if (findSum == sum) {
                System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
                return true;
            } else if (sum > findSum) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No pair found with the given sum.");
        return false;
    }
}
