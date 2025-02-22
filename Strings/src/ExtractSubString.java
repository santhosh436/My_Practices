import java.util.Scanner;

public class ExtractSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = scanner.nextLine();
        System.out.print("Enter the from index in the string: ");
        int from = scanner.nextInt();
        System.out.print("Enter the to index in the string: ");
        int to = scanner.nextInt();
        System.out.println("SubString: "+extractSubString(str,from,to));

    }
    public static String extractSubString(String str,int start,int end){
        char[] charArr = new char[end - start];
        for(int i= start;i<end;i++){
            charArr[i-start] = str.charAt(i);
        }
        return new String(charArr);
    }
}
