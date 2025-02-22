public class CountOccurenceOfCharacter {
    public static void main(String[] args) {
        String str = "Hello Guru and I am Santhosh";
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'o'){
                count++;
            }
        }
        System.out.println(count);
    }
}
