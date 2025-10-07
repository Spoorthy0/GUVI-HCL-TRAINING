@FunctionalInterface
interface A{
    int add(int a,int b);
}
@FunctionalInterface
interface B{
    String display(String name);
}
public class LambdaExpression {
    public static void main(String[] args) {
    
        A obj=(int a,int b)->{
            return (a+b);
        };
        System.out.println(obj.add(2, 6));

        B obj2=(name)-> name;
        System.out.println(obj2.display("Spoorthy"));

    }
}
