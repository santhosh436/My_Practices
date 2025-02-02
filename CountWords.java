public class CountWords {
    public static void main(String[] args) {
        String sentence = "Hello my name is santhosh Modi.";
        String[] words =  sentence.trim().split("\\s+");
        System.out.println(words.length);
    }
}
