public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String str = "Hello mama Ala Unnaru andharu";
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = str.split(" ");
        for(String s:words){
            String reverseWord = ReverseWord(s);
            stringBuilder.append(reverseWord)
                    .append(" ");
        }
        System.out.println(stringBuilder);
    }
    public static String ReverseWord(String str){
        int left = 0;
        int right = str.length()-1;
        char[] charArr = str.toCharArray();
        while(left < right){
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        return new String(charArr);
    }
}
