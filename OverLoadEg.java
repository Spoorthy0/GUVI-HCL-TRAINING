class Example{
    public void add(int a,int b){
        System.out.println("1st add "+(a+b));
    }
    public void add(double a,double b){
        System.out.println("2nd add "+(a+b));
    }
    public void add(int a,double b){
        System.out.println("3rd add "+a+b);
    }
    public void add(int a,int b,int c){
        System.out.println("4th add "+(a+b+c));
    }
    public void add(double a,int b){
        System.out.println("5th add "+(a+b));
    }
}
public class OverLoadEg {
    public static void main(String args[]){
        Example eg=new Example();
        eg.add(1,2);
        eg.add(0.3,0.5);
        eg.add(1,2.5);
        eg.add(2,3,4);
        eg.add(2.5,1);
    }
}
