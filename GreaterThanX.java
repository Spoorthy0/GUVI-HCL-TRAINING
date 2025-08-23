
import java.util.Scanner;

public class GreaterThanX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int count=0;
        int[] arr1=new int[size];
        for(int i=0;i <size;i++){
            boolean found=false;
            for(int j=0;j<count;j++){
                   if(arr[i]==arr1[j]){
                       found=true;
                       break;
                   }
            }
            if(!found){
                arr1[count]=arr[i];
                count++;
            }

        }
        for(int i=0;i<count;i++){
            if(arr1[i]>x){
                count++;
            }
        }
        System.out.println(count);
    }
}
