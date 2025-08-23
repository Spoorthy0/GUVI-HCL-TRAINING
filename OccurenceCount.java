
import java.util.Scanner;

public class OccurenceCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        int count=0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int x=sc.nextInt();
        for (int i = 0;i <size;i++) {
            if(arr[i]==x) {
                count++;
            }
        }if(count>0){
        System.out.println(count);
        }
        else{
            System.out.println("Element not found");
        }
    }
}