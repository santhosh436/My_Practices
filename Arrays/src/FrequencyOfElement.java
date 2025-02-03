import java.util.Scanner;

public class FrequencyOfElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        FindEachElementOccurence(arr);
    }

    public static void FindEachElementOccurence(int[] arr) {

        boolean[] visited = new boolean[arr.length];
        for(int i=0;i< arr.length;i++){

            if(visited[i]){
                continue;
            }
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }

            }
            System.out.println(arr[i] + " occurs "+ count+" times");
        }
    }
}
