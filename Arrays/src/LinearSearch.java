import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the target Element: ");
        int target = scanner.nextInt();
        int index = FindIndexOfTaget(arr,target);

        if( index == -1){
            System.out.println("Target not found in the array.");
        }
        else{
            System.out.println("Target Element Found at index: "+ index );
        }
    }
    public static int FindIndexOfTaget(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
