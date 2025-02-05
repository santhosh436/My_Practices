import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class FindFirstRepeatElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int element = findFirstRepeadElement(arr);
        System.out.println("The first repeat element is: "+element);
    }
    public static int findFirstRepeadElement(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (set.contains(j)) {
                return j;
            }
            set.add(j);
        }
        return -1;
    }
}
