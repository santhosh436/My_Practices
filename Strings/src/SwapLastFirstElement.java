public class SwapLastFirstElement {
    public static void main(String[] args) {
        String str = "hanthoss";

        String resultSwappedString = SwapCharacters(str);
        System.out.println("The String After Swapping: "+ resultSwappedString);

    }
    public static String SwapCharacters(String str){
        char[] charArr = str.toCharArray();
        int first = 0;
        int last = str.length()-1;
        char temp = charArr[first];
        charArr[first] = charArr[last];
        charArr[last] = temp;

        return new String(charArr);

    }
}
