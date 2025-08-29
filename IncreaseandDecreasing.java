public class IncreaseandDecreasing{
    public static void Increase(int n){
         if(n==0) return ;
         Increase(n-1);
         System.out.print(n+" ");

    }
    public static void Decrease(int n){
        if(n==0) return ;
        System.out.print(n+" ");
        Decrease(n-1);

    }
    public static void main(String[] args){
        int n=5;
        // for(int i=0;i<n;i++){
        // System.out.println(Decrease(i)+" ");
        // }
        Decrease(n);
        Increase(n);

    }
}