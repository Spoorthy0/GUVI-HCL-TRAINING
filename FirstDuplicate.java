import java.util.Scanner;

public class FirstDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        boolean FirstDuplicate=false;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    FirstDuplicate=true;
                    System.out.println(arr[i]);
                    break;
                }
                if(FirstDuplicate)
                    break;
            }
        }
        if(!FirstDuplicate)
            System.out.println(-1);
    }
}
