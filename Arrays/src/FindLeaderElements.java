import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*Logic: A leader is an element that is greater than all elements to its right. We start from the rightmost element and keep track of the maximum element seen so far. If an element is greater than this maximum, it’s a leader.

        Code:*/
public class FindLeaderElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        ArrayList<Integer> result = findLeaderElements(arr);
        System.out.println("Leader elements are :"+ result);

    }
    public static ArrayList<Integer> findLeaderElements(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<>();
        int maxRight = arr[arr.length-1];
        newArr.add(maxRight);
        for(int i = arr.length-2;i>=0;i--){
            if(arr[i] > maxRight){
                newArr.add(arr[i]);
                maxRight = arr[i];
            }
        }
        return newArr;
    }
}
