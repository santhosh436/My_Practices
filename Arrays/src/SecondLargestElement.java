import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        FindingElement(arr);
    }
    public static void FindingElement(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest =  Integer.MIN_VALUE;

        for(int i=0;i<arr.length-1;i++){
            if(largest<arr[i]){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("Second Largest: "+secondLargest);

    }
}
