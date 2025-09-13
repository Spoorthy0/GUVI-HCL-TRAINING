import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int size=obj.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        int queryCount=obj.nextInt();
        for(int i=0;i<queryCount;i++){
            int L=obj.nextInt();
            int R=obj.nextInt();
            System.out.println("The value of R is : "+R);
            int[] arr1=new int[R];
            int j=0;
            while(L<=R){
            while(j<R){
                arr1[j]=arr[L-1];
                L++;
                j++;
                }
            }
            for(int k=0;k<R;k++){
                System.out.print(arr1[k]+" ");
            }
            gcd(arr1);
        }

    }
    public static void gcd(int[] arr){
        for(int k=1;k<arr.length;k++){
            int a=arr[k];
            int b=arr[k-1];
            int gcd=1;
            for(int j=2;j<=Math.min(a,b);j++){
                if(a%j==0 && b%j==0){
                    gcd=j;
                }
            }
            System.out.print(gcd+" ");
            

        }
    }
}