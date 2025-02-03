import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//How Binary Search Works?
//Sorting (Precondition): The array must be sorted before applying binary search.
//Finding the Midpoint: Calculate the middle index of the search range.
//Comparison:
        //If the middle element is equal to the target, return its index.
        //If the middle element is smaller than the target, search the right half.
        //If the middle element is greater than the target, search the left half.
        //Repeat the Process: Keep narrowing down the search space until the target is found or the range becomes invalid (left > right).
public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = scanner.nextInt();
        int result = FindTargetIndexByBinarySearch(arr,target);
        if(result != -1){
            System.out.println("Element at found at "+result+ " index.");
        }
        else{
            System.out.println("target not found.");
        }
    }
    public static int FindTargetIndexByBinarySearch(int[] arr ,int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right -left)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid+1;
            } else if (arr[mid] > target) {
                right = mid+1;
            }
        }
        return -1;
    }
}
