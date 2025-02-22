public class ReplaceOccurenceOfElement {
    public static void main(String[] args) {
        String str = "N@masthey M@m@ How @re you";
        char[] charArr = str.toCharArray();
        for(int i=0;i<charArr.length;i++){
            if(charArr[i] == '@'){
                charArr[i] = 'a';
            }
        }
        String newStr = new String(charArr);
        System.out.println(newStr);
    }
}

