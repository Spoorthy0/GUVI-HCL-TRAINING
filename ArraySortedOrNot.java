
import java.util.Scanner;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        boolean isSorted=true;
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }

    }
}
