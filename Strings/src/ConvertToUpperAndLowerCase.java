import java.awt.*;
import java.util.Scanner;

public class ConvertToUpperAndLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        System.out.println("convert to uppercase: "+toUpper(input));
        System.out.println("convert to uppercase: "+toLowerCase(input));

    }
    public static String toUpper(String str){
        char[] charArr = str.toCharArray();
        for(int i=0;i<charArr.length;i++){
            if(charArr[i] >= 'a' && charArr[i] <= 'z'){
                charArr[i]-=32;
            }
        }
        String newStr = new String(charArr);
        return newStr;
    }
    public static String toLowerCase(String str){
        char[] charArr = str.toCharArray();
        for(int i=0;i<charArr.length;i++){
            if(charArr[i] >= 'A' && charArr[i] <= 'Z'){
                charArr[i]+= 32;
            }
        }
        String newStr = new String(charArr);
        return newStr;
    }
}
