import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(CheckingSorted(arr));

    }
    public static String CheckingSorted(int[] arr){
        boolean asc = true;
        boolean dsc = true;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i] > arr[i+1])  asc = false;
            if(arr[i] < arr[i+1])  dsc = false;

        }
        if (asc) return "Sorted in Ascending Order";
        if (dsc) return "Sorted in Descending Order";
        return "Not Sorted";
    }
}
