import java.util.Arrays;

public class RemoveDuplicatesInArray {
    public static int removeDuplicates(int[] arr){

        int slow = 0;
        for(int fast = 1;fast<arr.length;fast++){
            if(arr[fast] != arr[slow]){
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return slow+1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4,4,2,4};
        Arrays.sort(arr);
        int length = removeDuplicates(arr);
        System.out.print("Modified Array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
