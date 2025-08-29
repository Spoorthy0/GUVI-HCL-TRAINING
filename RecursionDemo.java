public class RecursionDemo {
    public static int Sum(int n){
        if(n==1) return 1;
        else return n+Sum(n-1);
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(Sum(n));
    }
}
