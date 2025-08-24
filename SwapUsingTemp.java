
import java.util.Scanner;

public class SwapUsingTemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swapping values of a and b are a: "+a+" b:"+b);
        swap(a,b);
    }

    public static void swap(int a,int b){
            int temp=a;
            a=b;
            b=temp;
            System.out.println("After swapping values of a and b are a: "+a+" b:"+b);
        }

    
}
