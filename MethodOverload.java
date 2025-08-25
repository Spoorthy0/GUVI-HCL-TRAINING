public class MethodOverload {
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void add(){
        int a=12;
        int b=1;
        System.out.println(a+b);

    }
    public static void main(String[] args) {
        System.out.println(add(2,6));
        System.out.println(add(1,2,3));
        add();

    }
}
