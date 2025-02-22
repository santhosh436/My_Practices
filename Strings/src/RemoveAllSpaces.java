public class RemoveAllSpaces {
    public static void main(String[] args) {
        String sample = "Hello My Name Is Santhosh";
        String result = removeSpaces(sample);
        System.out.println("The String after removing spaces: "+result);

    }
    public static String removeSpaces(String str){
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}
