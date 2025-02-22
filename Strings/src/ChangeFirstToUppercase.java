public class ChangeFirstToUppercase {
    public static void main(String[] args) {
        String str = "hello guys my self santhosh";
        StringBuilder result = new StringBuilder();
        String[] words = str.split(" ");
        for(String s: words){
            if(!s.isEmpty()){
                result.append(Character.toUpperCase(s.charAt(0)))
                        .append(s.substring(1))
                        .append(" ");

            }
        }
        System.out.println(result);
    }
}
