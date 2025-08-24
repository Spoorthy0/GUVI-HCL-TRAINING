import java.util.Scanner;

public class RotateArray {
    public static void rotateArray(int[] arr,int k,int n){
        k=k%n;
        reverseArray(arr,0,n-k-1);
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static int[] reverseArray(int[] arr,int start,int end){
        while(start<end){
            Swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }
    public static void Swap(int[] arr,int a,int b){
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        rotateArray(arr,k,size);
    }
}
