import java.util.Scanner;

public class FibonacciSeries {
    public void series(int n){
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci Series:"+a+" "+b+" ");
        for(int i=2;i<n;i++){
            int next = a+b;
            System.out.print(next+" ");
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int input = sc.nextInt();
        FibonacciSeries obj = new FibonacciSeries();
        obj.series(input);
    }
}
