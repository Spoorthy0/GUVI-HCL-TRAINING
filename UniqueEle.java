
import java.util.Scanner;

public class UniqueEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int ele:arr){
            if(ele>max)
            max=ele;
        }
        int[] freq=new int[max+1];
        for(int ele:arr){
            freq[ele]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                System.out.print(i+" ");
            }
        }


    }
}
