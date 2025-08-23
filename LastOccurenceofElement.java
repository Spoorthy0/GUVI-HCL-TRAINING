
import java.util.Scanner;

public class LastOccurenceofElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int index=-1;
        for(int i=0;i<size;i++){
            if(arr[i]==x){
                index=i;
            }
        }
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println(index);
        }
    }

    }

