public class DigitCountInString {
    public static void main(String[] args) {
        String str = "Hello I am Santhosh and My roll number is 20G21A04D7 and my phone number is 9701724657";
        int digitCount = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                digitCount++;
            }
        }
        System.out.println("the count of digits in the string is "+digitCount);
    }
}
