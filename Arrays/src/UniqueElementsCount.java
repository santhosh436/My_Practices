import java.util.Arrays;
import java.util.Scanner;

public class UniqueElementsCount {
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
        int lastNum = Integer.MAX_VALUE;
        int uniqueCount = 0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] != lastNum){
                uniqueCount++;
            }
            lastNum = arr[i];
        }
        System.out.println("The Count of unique elements: "+uniqueCount);
    }
}
