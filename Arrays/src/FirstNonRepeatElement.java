import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = findFirstNonRepeatElement(arr);
        System.out.println("The first Non repeated element: "+result);
    }
    public static int findFirstNonRepeatElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j:arr){
            map.put(j,map.getOrDefault(j,0)+1);
        }
        for (int num : arr) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
