import java.util.Arrays;
import java.util.Scanner;

public class FindMaxSumSubarrray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the sub array size: ");
        int size = scanner.nextInt();
        String result = Arrays.toString(maxSumSubArray(arr,size));
        System.out.println("Sub Array: "+result);
    }
    public static int[] maxSumSubArray(int[] arr,int size){
        int windowSum = 0;
        int maxSum = 0;
        int start = 0;
        for(int i=0;i<size;i++){
            windowSum += arr[i];
        }
        maxSum = windowSum;
        for(int i=size;i<arr.length;i++){
            windowSum = windowSum-arr[i-size]+arr[i];
            if(windowSum>maxSum){
                maxSum = windowSum;
                start = i-size+1;
            }
        }
        int[] result = new int[size];
        for(int i=0;i<size;i++){
            result[i] = arr[start+i];
        }
        System.out.println("MaxSum :" +maxSum);
        return result;
    }
}
