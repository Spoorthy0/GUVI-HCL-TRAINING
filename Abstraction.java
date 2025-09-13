abstract class Phone{
    abstract void on();
    String name;
    public Phone(){
        this.name="Spoorthy";
        System.out.println(name);
    }
    public void Dailing(){
        System.out.println("Dailing to Mom");
    }
}
class SmartPhone extends Phone{
    public void on(){
        System.out.println("Calling..");
    }
    public void Oncall(){
        System.out.println("On call");
    }

}
public class Abstraction {
    public static void main(String[] args) {
        SmartPhone s1=new SmartPhone();
        s1.on();
        s1.Dailing();
        // Phone p1=new SmartPhone();
        // System.out.println(p1.name);
        // p1.on();
        // p1.OnCall();
    }
}
