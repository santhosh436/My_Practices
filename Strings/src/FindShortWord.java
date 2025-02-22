public class FindShortWord {
    public static void main(String[] args) {
        String str = "hi my dear students";
        String[] words = str.split(" ");
        String resultWord = "";
        int smallLenWord = words[0].length();
        for(int i=1;i<words.length;i++){
            if(smallLenWord >= words[i].length()  ){
                smallLenWord = words[i].length();
                resultWord = words[i];

            }
        }
        System.out.println("The smallest word in the given String is "+ resultWord+" with a length of "+smallLenWord);
    }
}
