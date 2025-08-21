
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=0,n2=1;
        int range=sc.nextInt();
        int temp=0;
        System.out.print(n1+" "+n2);
        for(int i=2;i<range;i++){
            temp=n1+n2;
            n1=n2;
            n2=temp;
            System.out.print(temp+" ");
        }
    }
}
