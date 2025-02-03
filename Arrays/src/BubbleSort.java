import java.util.Arrays;
import java.util.Scanner;

/*How Bubble Sort Works?:
    1.Start from the first element and compare it with the next element.
    2.If the first element is greater than the second, swap them.
    3.Move to the next adjacent pair and repeat the process until the end of the array.
    4.After the first pass, the largest element moves to the last position.
    5.Repeat the process for the remaining unsorted elements until the array is completely sorted.
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array Before Sorted: "+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Array After Sorted: "+Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
