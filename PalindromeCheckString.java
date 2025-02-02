public class PalindromeCheckString {

    public static void main(String[] args) {
        String input = "racecar";
        if(isPalindrome(input)){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a Palindrome");
        }
    }

    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length()-1;
        while (left < right){
            if(input.charAt(left) != input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
