
import java.util.Scanner;

public class GreatestWithoutTernary {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Greatest number is: " + Math.max(a, Math.max(b, c)));
    }
}
