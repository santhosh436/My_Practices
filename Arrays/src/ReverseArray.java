import java.util.Arrays;
import java.util.Scanner;
//Reverse the Array
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int left = 0;
        int right = arr.length-1;
        WithRecursion(arr,left,right);
        System.out.println(Arrays.toString(arr));
    }
    public static void WithTwoPointer(int[] arr,int left,int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void WithRecursion(int[] arr,int left,int right ){
        if(left >= right){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        WithRecursion( arr,left+1,right-1);
    }
}
