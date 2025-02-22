public class FindLongestWord {
    public static void main(String[] args) {
        String str = " Hello Bro Allaram Vanakkam ,My self Santhosh.";
        String[] words = str.split(" ");
        String resultWord = "";
        int maxWordLen = words[0].length();
        for(int i=1;i<words.length;i++){
            if(words[i].length() > maxWordLen){
                maxWordLen = words[i].length();
                resultWord = words[i];
            }
        }
        System.out.println("The longest word in the sentence is "+ resultWord+" with a length of "+ maxWordLen);
    }
}
