
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original=n;
        int rev=0;
        while(n>0){
            rev=(rev*10)+ n%10;
            n=n/10;
        }
        if(original==rev){
            System.out.print("It is palindrome");
        }
        else{
            System.out.print("Not a palindrome");
        }

    }
}
