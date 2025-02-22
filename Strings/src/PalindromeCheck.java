import java.awt.*;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input = scanner.nextLine();
        if(!checkPalindrome(input)){
            System.out.println("It is not a palindrome");
        }
        else {
            System.out.println("It is a palindrome.");
        }
    }
    public static boolean checkPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
