public class FibonacciRecursion{
    public static int Fib(int n){
        if(n==0||n==1) return n;
        return Fib(n-1)+Fib(n-2);

    }
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<=n;i++){
        System.out.print(Fib(i)+" ");
        }
    }
}