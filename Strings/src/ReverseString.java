public class ReverseString {
    public static void main(String[] args) {
        String str = "hsohtnas ";
        char[] charArr = str.toCharArray();
        int left = 0;
        int right = charArr.length-1;
        while(left < right){
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        System.out.println("The reversed String:"+new String(charArr));
    }
}
