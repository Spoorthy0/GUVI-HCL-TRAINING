interface SimpleCalc{
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    double div(int a, int b);
}
interface AdvancedCalc extends SimpleCalc{
    int modulus(int a,int b);
    int power(int a,int b);
}
interface ScientificCalc extends AdvancedCalc{
    double sin(int a);
    double cos(int a);
    double tan(int a);
    double log(int a);
    double sqrt(int a);
}
interface ProgrammerCalc extends ScientificCalc{
    String toBinary(int a);
    String toOctal(int a);
    String toHexadecimal(int a);
}
interface  AllCalc extends ProgrammerCalc{
    int factorial(int a);
    int gcd(int a,int b);
    int lcm(int a,int b);
    int fibonacci(int a);
    int permutation(int a,int b);
    int combination(int a,int b);

}
class Calculator implements AllCalc{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public double div(int a, int b){
        if(b==0){
            System.out.println("Division by zero is not allowed");
            return 0;
        }
        return a/b;
    }
    public int modulus(int a,int b){
        return a%b;
    }
    public int power(int a,int b){
        return (int)Math.pow(a,b);
    }
    public double sin(int a){
        return Math.sin(Math.toRadians(a));
    }
    public double cos(int a){
        return Math.cos(Math.toRadians(a));
    }
    public double tan(int a){
        return Math.tan(Math.toRadians(a));
    }
    public double log(int a){
        if(a<=0){
            System.out.println("Logarithm of non-positive numbers is not defined");
            return 0;
        }
        return Math.log(a);
    }
    public double sqrt(int a){
        if(a<0){
            System.out.println("Square root of negative numbers is not defined");
            return 0;
        }
        return Math.sqrt(a);
    }
    public String toBinary(int a){
        return Integer.toBinaryString(a);
    }
    public String toOctal(int a){
        return Integer.toOctalString(a);
    }
    public String toHexadecimal(int a){
        return Integer.toHexString(a);
    }
    public int factorial(int a){
        if(a<0){
            System.out.println("Factorial of negative numbers is not defined");
            return 0;
        }
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    public int fibonacci(int a){
        if(a<=0){
            System.out.println("Fibonacci of non-positive numbers is not defined");
            return 0;
        }
        if(a==1 || a==2){
            return 1;
        }
        int fib1=1,fib=0;
        for(int i=3;i<=a;i++){
            fib=fib1+fib;
            fib1=fib;
        }
        return fib;
    }
    public int permutation(int a,int b){
        if(b>a || a<0 || b<0){
            System.out.println("Permutation is not defined for these values");
            return 0;
        }
        return factorial(a)/factorial(a-b);
    }
    public int combination(int a,int b){
        if(b>a || a<0 || b<0){
            System.out.println("Combination is not defined for these values");
            return 0;
        }
        return factorial(a)/(factorial(b)*factorial(a-b));
    }
}
public class Calc {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println("Addition: "+calc.add(5,3));
        System.out.println("Subtraction: "+calc.sub(5,3));
        System.out.println("Multiplication: "+calc.mul(5,3));
        System.out.println("Division: "+calc.div(5,0));
        System.out.println("Modulus: "+calc.modulus(5,3));
        System.out.println("Power: "+calc.power(5,3));
        System.out.println("Sine: "+calc.sin(30));
        System.out.println("Cosine: "+calc.cos(60));
        System.out.println("Tangent: "+calc.tan(45));
        System.out.println("Logarithm: "+calc.log(10));
        System.out.println("Square Root: "+calc.sqrt(16));
        System.out.println("Binary: "+calc.toBinary(10));
        System.out.println("Octal: "+calc.toOctal(10));
        System.out.println("Hexadecimal: "+calc.toHexadecimal(10));
        System.out.println("Factorial: "+calc.factorial(5));
        System.out.println("GCD: "+calc.gcd(54,24));
        System.out.println("LCM: "+calc.lcm(54,24));
        System.out.println("Fibonacci: "+calc.fibonacci(7));
        System.out.println("Permutation: "+calc.permutation(5,2));
        System.out.println("Combination: "+calc.combination(5,2));
    }
}
