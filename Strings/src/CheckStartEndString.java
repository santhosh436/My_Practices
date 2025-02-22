public class CheckStartEndString {
    public static void main(String[] args) {
        String str = "sirsathyasri";
        String CheckStr = "sri";

        boolean result = CheckCon(str,CheckStr);

        if(result){
            System.out.println("The given string starts and ends with "+CheckStr+" String.");
        }
        else {
            System.out.println("The given string Not starts and ends with "+ CheckStr +" String.");
        }



    }
    public static boolean CheckCon(String str, String CheckStr){
        if(str.length()<CheckStr.length()) return false;
        for(int i=0;i<CheckStr.length();i++){
            if(CheckStr.charAt(i) != str.charAt(i)){
                return false;
            }
        }
        int endStringLen = str.length()-CheckStr.length();

        for(int i=0;i<CheckStr.length();i++){
            if(str.charAt(endStringLen+i) != CheckStr.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
