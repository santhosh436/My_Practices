import java.util.Arrays;
import java.util.Scanner;

public class FindKthLargestValue {
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
        System.out.print("The "+k+"th largest values is: "+ findKthLargestValue(arr,k));
    }
    public static int findKthLargestValue(int[] arr , int k){
        int uniqueCount = 0;
        int lastNum = Integer.MAX_VALUE;
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i] != lastNum){
                uniqueCount++;
                if(uniqueCount == k){
                    return arr[i];
                }
            }
            lastNum = arr[i];
        }
        return -1;
    }
}
