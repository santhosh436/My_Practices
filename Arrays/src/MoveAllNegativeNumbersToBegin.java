import java.util.Arrays;
import java.util.Scanner;

public class MoveAllNegativeNumbersToBegin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        moveNegativeValuetoBegin(arr);
        System.out.println("Array after moving negative number to beginning: "+Arrays.toString(arr));
    }
    public static void moveNegativeValuetoBegin(int[] arr) {
        int left = 0, right = 0;
        int n = arr.length;

        while (right < n) {
            if (arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
    }
}
