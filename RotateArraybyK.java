
import java.util.Scanner;

public class RotateArraybyK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        //rotateKtimes(arr, k, size);
        int i=size-1; //4
             k=k%size;//1
             int newIndex=0;
             if(i<=size-k){ //4
                for(int j=size-k;j<size;j++){
                    int temp=arr[newIndex];
                    arr[newIndex++]=arr[j];
                    arr[j]=temp;
                    i--;
                }
            }
                // for(int j=0;j<=i;j++){
                //     arr[newIndex++]=arr[j];
                // }
               for(int j=size-k;j<arr.length/2;j++){
                      int temp=arr[j];
                     arr[j]=arr[arr.length-1-j];
                     arr[arr.length-1-j]=temp;
                 }  
            //  else{
            //      for(int j=0;j<k;j++){
            //          arr[newIndex++]=arr[i--];
            //      }
            //  }



        
    
        // public static void rotateKtimes(int[] arr,int k,int size){
        //     k=k%size;
        //     int[] ans=new int[size];
        //     int j=0;
        //     for(int i=size-k;i<size;i++){
        //         ans[j++]=arr[i];
        //     }
        //     for(int i=0;i<size-k;i++){
        //         ans[j++]=arr[i];
        //     }
            for(int ele:arr){
            System.err.print(ele+" ");
        }
    }
}
