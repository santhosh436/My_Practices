public class ChangeCharWiseVersa {
    public static void main(String[] args) {
        String str = "Hello FriEndS hoW aRe U";
        StringBuilder stringBuilder = new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                ch = Character.toUpperCase(ch);
            }else if(ch >= 'A' && ch <= 'Z'){
                ch = Character.toLowerCase(ch);
            }
            stringBuilder.append(ch);
        }
        System.out.println(stringBuilder);
    }

}
